package cn.itcasr04;


import java.util.Random;
import java.util.Scanner;
public class TestEquals {

	public static void main(String[] args) {
		Person p = new Person("����", 23);
		System.out.println(p);
		System.out.println(p.toString());
		
		Random r = new Random();
		System.out.println(r);
		
		Scanner sc = new Scanner(System.in);
		System.out.println(sc);
		String sss = "1234567";
		System.out.println(sss.substring(1, 5));
		System.out.println(sss.substring(3));
		System.out.println(sss.indexOf("3"));
		
		StringBuffer buffer = new StringBuffer();
		buffer.append(1234567);
//		buffer.delete(1,5);
//		System.out.println(buffer);
		
	    
//	    buffer.insert(3, 9.1);
	    buffer.replace(1,4, "��");
	    System.out.println(buffer);
	}
}
