package cn.itcast06;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		bigDec();
		
	}
// BigDecimal ���󸡵���������
public static void bigDec() {
	BigDecimal b1 = new BigDecimal("0.09");
	BigDecimal b2 = new BigDecimal("0.01");
	
	// +
	BigDecimal add = b1.add(b2);
	System.out.println(add); // 0.10
	
	// -
	BigDecimal sub = b1.subtract(b2);
	System.out.println(sub); // 0.08
	
	// *
	BigDecimal mul = b1.multiply(b2);
	System.out.println(mul); // 0.0009
	
	// /
	BigDecimal div = b1.divide(b2);
	System.out.println(div);	// 9	
	
}
	// BigIngeter ������������
	public static void big() {
		BigInteger b1 = new BigInteger("505502342323423342300000000");
		BigInteger b2 = new BigInteger("9091212312413412412310000000000000000000000000");
		
		// +
		BigInteger add = b1.add(b2);
		System.out.println(add); // 9091212312413412412815502342323423342300000000
		
		// -
		BigInteger sub = b1.subtract(b2);
		System.out.println(sub); // -9091212312413412411804497657676576657700000000
		
		// *
		BigInteger mul = b1.multiply(b2);
		System.out.println(mul); // 4595629118484525918274232251757605863713000000000000000000000000000000000
		
		// /
		BigInteger div = b1.divide(b2);
		System.out.println(div);	// 0	
		
	}
	// ���������ַ���
	public static void toString_1() {
		int[] arr = {10,22,33,44,55,66};
		String str = Arrays.toString(arr);
		System.out.println(str);  // [10, 22, 33, 44, 55, 66]
	}
	// Arrays.binarySearch  
	// ��Ĳ����� ����   (-����� - 1)
	public static void bin() {
		int[] arr = {10,22,33,44,55,66};
		int index = Arrays.binarySearch(arr, 100);
		System.out.println(index); // 1
	}
	// Arrays.sort(arr) ����
	public static void sort_1() {
		int[] arr = {5,6,7,3,2,5,3,5,2,4,1,0,1,1,3,5,2};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);  // �ź���Ľ��
		}
	}
	
	//Math.random()   ��ʦ˵���ַ�ʽ��ȡ����� ���Ƽ��� ԭ��ת���Ƚ��鷳
	public static void Random_1() {
		for(int i = 0;i<10;i++) {
			System.out.println(Math.random());  //  0.2652532899626049
		}
	}
	public static void function() {
	    int[] src = {11,22,33,44,55};
	    int[] desc = {77,03,23,45};
	    System.arraycopy(src, 1, desc, 1, 2);
	    for(int i = 0; i < desc.length; i++) {
	        System.out.println(desc[i]);
	    }
	    // 
	}
	// System.currentTimeMillis() �ĵ� ����ִ����Ҫ�೤ʱ��
	public static void test_2() {
		long start = System.currentTimeMillis();
		
		for(long i = 0; i < 1000; i++) {
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	
	// Integer ����
	public static void test_1(){
		Integer i = 127;
		Integer j = 127;
		System.out.println(i == j);
		System.out.println(i.equals(j));
	}
	// i--  �����ֵ
	public static void iNmber() {
		int i = 100;
		//System.out.println(i--); // 100
		System.out.println(--i); // 99
	}
	// ������������  ��� �ַ���
	public static void showString() {
		int a = 10;
		String b = a+"";
		System.out.println(b);  // �����ַ��� 10
	}
	
	//Integer.praseInt() ����
	public static void Integer_1() {
		int i = Integer.parseInt("123231");
		System.out.println(i/2);  // 61615
	}
}