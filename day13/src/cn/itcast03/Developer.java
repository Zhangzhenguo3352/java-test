package cn.itcast03;
/*
 * 研发部 类 是 员工的一种， 所以 继承员工类
 */
public abstract class Developer extends Employee {
	public Developer (String name, String id) {
		super(name, id);
	}
}
