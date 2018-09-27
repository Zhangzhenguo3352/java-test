package cn.itcast03;
/*
 * 网络工程师，维护部
 * 继承维护部 类
 */
public class Net extends Maintainer{
	public Net(String name, String id) {
		super(name, id);
	}
	public void work(){
		System.out.println(getName()+ "..." + getId()+"检查网络畅通");
	}
}
