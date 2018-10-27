/**
 * @Author Zhenggq
 * @Date: 2018/10/27 16:43
 * @Description:
 * @Version 1.0
 **/
public class TestMethod {


	public String haha(String name) {
		if (name.equals("Zhenggq")) {
			return "宇宙无敌帅强," + "哈哈哈";
		} else {
			return other(name);
		}
	}


	public String other(String name) {
		return name + ",哈哈哈";
	}


	public static void main(String[] args) {
		TestMethod t = new TestMethod();
		System.out.println(t.haha("Zhenggq"));
		System.out.println(t.haha("陆小胖"));
	}
}
