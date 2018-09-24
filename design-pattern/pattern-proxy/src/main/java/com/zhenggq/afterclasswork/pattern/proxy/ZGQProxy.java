package com.zhenggq.afterclasswork.pattern.proxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/22 12:56
 * @Description:
 * @Version: 1.0
 */
public class ZGQProxy {

    private static final String LN = "\r\n";

    public static Object newProxyInstance(ZGQClassLoader loader, Class<?>[] interfaces, ZGQInvocationHandler handler) {
        try {
            //1:动态生成java源代码
            String src = generateCode(interfaces);
            //2.保存源代码
            String path = ZGQProxy.class.getResource("").getPath();
            File file = new File(path + "$ZGQProxy0.java");
            FileWriter fw = new FileWriter(file);
            fw.write(src);

            fw.flush();
            fw.close();

            //3.编译源代码
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manage = compiler.getStandardFileManager(null, null, null);
            Iterable iterable = manage.getJavaFileObjects(file);

            JavaCompiler.CompilationTask task = compiler.getTask(null, manage, null, null, null, iterable);
            task.call();
            manage.close();


            //4.将编译文件加载到jvm中
            Class<?> clazz = loader.findClass("$ZGQProxy0");
            System.out.println(clazz);
            Constructor c = clazz.getConstructor(ZGQInvocationHandler.class);
            file.delete();

            System.out.println(c);

            //5.返回字节码重组后的对象
            return c.newInstance(handler);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;
    }

    private static String generateCode(Class<?>[] interfaces) {
        StringBuilder sb = new StringBuilder();
        sb.append("package com.zhenggq.afterclasswork.pattern.proxy;" + LN);
        sb.append("import com.zhenggq.afterclasswork.pattern.proxy.IGamePlayer;" + LN);
        sb.append("import java.lang.reflect.Method;" + LN);


        sb.append("public class $ZGQProxy0 ");
        for (Class<?> clazz : interfaces) {
            sb.append(" implements " + clazz.getName());
        }
        sb.append(" {" + LN);

        sb.append("ZGQInvocationHandler h;");
        sb.append("public $ZGQProxy0 (ZGQInvocationHandler h){" + LN);
        sb.append("this.h=h;");
        sb.append("}");


        for (Class<?> clazz : interfaces) {
            Method[] ms = clazz.getMethods();
            for (Method m : ms) {
                sb.append("public " + m.getReturnType() + " " + m.getName() + "(){" + LN);
                sb.append("try{");
                sb.append("Method m = " + clazz.getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{});" + LN);
                sb.append("this.h.invoke(this,m,null);" + LN);
                sb.append("}catch (Throwable e) {" + LN);
                sb.append("e.printStackTrace();" + LN);
                sb.append("}" + LN);

                sb.append("}" + LN);
            }
        }


        sb.append("}" + LN);

        return sb.toString();
    }
}
