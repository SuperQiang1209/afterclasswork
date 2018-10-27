package com.zhenggq.afterclasswork.spring5source.ch02;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @Auther: Zhenggq
 * @Date: 2018/10/14 20:59
 * @Description:
 * @Version: 1.0
 */
public class XmlBeanFactoryTest {

    public static void main(String[] args) {
        // 根据Xml 配置文件创建Resource 资源对象，该对象中包含了BeanDefinition 的信息
        ClassPathResource resource = new ClassPathResource("application-context.xml");
        // 创建DefaultListableBeanFactory
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        //创建XmlBeanDefinitionReader 读取器，用于载入BeanDefinition。
        // 之所以需要BeanFactory 作为参数，是因为会将读取的信息回调配置给factory
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        // XmlBeanDefinitionReader 执行载入BeanDefinition 的方法，最后会完成Bean 的载入和注册。
        // 完成后Bean 就成功的放置到IOC 容器当中，以后我们就可以从中取得Bean 来使用
        reader.loadBeanDefinitions(resource);
    }
}
