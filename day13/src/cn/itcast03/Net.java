package cn.itcast03;
/*
 * ���繤��ʦ��ά����
 * �̳�ά���� ��
 */
public class Net extends Maintainer{
	public Net(String name, String id) {
		super(name, id);
	}
	public void work(){
		System.out.println(getName()+ "..." + getId()+"������糩ͨ");
	}
}
