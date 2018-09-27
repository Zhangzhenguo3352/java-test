package cn.itcast07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class test {
	public static void main(String[] args) {
		forDemo_1();
		
	}
	// 增强for
	public static void forDemo_1() {
		int[] arr = {12,34,1};
		for(int i : arr) {
			System.out.println(i);
			//12
			//34
			//1
		}
	}
	// Collection  和 Iterator 返回值 不指定 数据类型，的那些事
	public static void Iterator_2() {
		Collection coll = new ArrayList();
		coll.add("aa");
		coll.add("bbcc");
		Iterator it = coll.iterator();
		while(it.hasNext()){
			Object o = it.next();
			String str = (String)o;  // 老师说显得麻烦， 不如一开始就指定数据类型
			System.out.println(str.length());
		}
	}
	
	// 	Iterator 迭代器 ， 统一了 取出 集合方法
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
		// 使用 for 循环实现
		for(Iterator<String> it2 = coll.iterator(); it2.hasNext();) {
			String s = it2.next();
			System.out.println(s);
			//aa
			//bb
			//cc
		}
	}
	
	// remove(删除的元素)  // 删除集合里 某一个元素
	public static void ArrayList_6() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("zz");
		coll.add("aa");
		coll.add("cc");
		
		System.out.println(coll); // [zz, aa, cc]
		
		boolean b = coll.remove("cc");
		System.out.println(coll); // [zz, aa]
	}
	
	//toArray() 集合元素 转 对象
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
	
	// contains(Object o) 判断对象是否 包含在 集合中，对象存在返回 true
	private static void ArrayList_4() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("zz");
		coll.add("bb");
		coll.add("cc");
		
		boolean b = coll.contains("zz");
		
		System.out.println(b); // true
	}


	// clear() 清除集合中所有元素
	public static void ArrayList_3() {
		// 多态的方法 调用
		Collection<String> coll = new ArrayList<String>();
		coll.add("11");
		coll.add("22");
		
		System.out.println(coll); // [11, 22]
		coll.clear();
		System.out.println(coll); // []
	}
	
	// 普通的 ArrayList 使用
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
	// 存储对象的 ArrayList
	public static void ArrayList_2() {
		ArrayList<person>  arrayPer = new ArrayList<person>();
		arrayPer.add(new person("张振国1", 12));
		arrayPer.add(new person("张振国2", 13));
		arrayPer.add(new person("张振国3", 14));
		arrayPer.add(new person("张振国4", 15));
		for (int i = 0; i < arrayPer.size(); i++) {
			// 重写了 toString()  子类 的方法
			System.out.println(arrayPer.get(i));
		}
	}
}
