package cn.itcast03;
/*
 * 定义javaEE 工程师
 * 属于 研发部 员工，继承 研发部
 */
public class JavaEE extends Developer {
	public JavaEE (String name, String id) {
		super(name, id);
	}
	
	public void work() {
		System.out.println(super.getName()+ "..." + super.getId()+"");
	}
}
