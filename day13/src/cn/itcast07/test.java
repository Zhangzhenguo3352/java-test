package cn.itcast07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class test {
	public static void main(String[] args) {
		forDemo_1();
		
	}
	// ��ǿfor
	public static void forDemo_1() {
		int[] arr = {12,34,1};
		for(int i : arr) {
			System.out.println(i);
			//12
			//34
			//1
		}
	}
	// Collection  �� Iterator ����ֵ ��ָ�� �������ͣ�����Щ��
	public static void Iterator_2() {
		Collection coll = new ArrayList();
		coll.add("aa");
		coll.add("bbcc");
		Iterator it = coll.iterator();
		while(it.hasNext()){
			Object o = it.next();
			String str = (String)o;  // ��ʦ˵�Ե��鷳�� ����һ��ʼ��ָ����������
			System.out.println(str.length());
		}
	}
	
	// 	Iterator ������ �� ͳһ�� ȡ�� ���Ϸ���
	public static void Iterator_1() {
	//  Collection<String> coll = new ArrayList<String>();
		Collection<String> coll = new HashSet<String>();
		coll.add("aa");
		coll.add("bb");
		coll.add("cc");
		Iterator<String> it = coll.iterator();
//		while(it.hasNext()) {
//			String s = it.next();
//			System.out.println(s);
//			//aa
//			//bb
//			//cc
//		}
//		
		// ʹ�� for ѭ��ʵ��
		for(Iterator<String> it2 = coll.iterator(); it2.hasNext();) {
			String s = it2.next();
			System.out.println(s);
			//aa
			//bb
			//cc
		}
	}
	
	// remove(ɾ����Ԫ��)  // ɾ�������� ĳһ��Ԫ��
	public static void ArrayList_6() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("zz");
		coll.add("aa");
		coll.add("cc");
		
		System.out.println(coll); // [zz, aa, cc]
		
		boolean b = coll.remove("cc");
		System.out.println(coll); // [zz, aa]
	}
	
	//toArray() ����Ԫ�� ת ����
	public static void ArrayList_5() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("zz");
		coll.add("bb");
		coll.add("cc");
		
		Object[] arr = coll.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			//zz
			//bb
			//cc
		}
	}
	
	// contains(Object o) �ж϶����Ƿ� ������ �����У�������ڷ��� true
	private static void ArrayList_4() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("zz");
		coll.add("bb");
		coll.add("cc");
		
		boolean b = coll.contains("zz");
		
		System.out.println(b); // true
	}


	// clear() �������������Ԫ��
	public static void ArrayList_3() {
		// ��̬�ķ��� ����
		Collection<String> coll = new ArrayList<String>();
		coll.add("11");
		coll.add("22");
		
		System.out.println(coll); // [11, 22]
		coll.clear();
		System.out.println(coll); // []
	}
	
	// ��ͨ�� ArrayList ʹ��
	public static void ArrayList_1() {
		ArrayList<Integer>  list = new ArrayList<Integer>();
		list.add(111);
		list.add(222);
		list.add(333);
		list.add(444);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	// �洢����� ArrayList
	public static void ArrayList_2() {
		ArrayList<person>  arrayPer = new ArrayList<person>();
		arrayPer.add(new person("�����1", 12));
		arrayPer.add(new person("�����2", 13));
		arrayPer.add(new person("�����3", 14));
		arrayPer.add(new person("�����4", 15));
		for (int i = 0; i < arrayPer.size(); i++) {
			// ��д�� toString()  ���� �ķ���
			System.out.println(arrayPer.get(i));
		}
	}
}