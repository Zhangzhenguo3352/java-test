package cn.itcast01;

public class Test {
	public static void main(String[] args){
		Person p = new Person();
		
		p.setName("����");
		p.setAge(23);
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
		Person b = new Person("�����", 26);
		
		System.out.println(b.getName());
		System.out.println(b.getAge());
		
	} 
}
