package cn.itcast09;

	import java.util.ArrayList;
	import java.util.LinkedHashSet;
	
import java.util.LinkedHashMap;
	import java.util.Map;
	import java.util.HashMap;
	import java.util.Set;
import java.util.Iterator;

public class test {
	public static void main(String[] args) {
		
		hashMap_3();
	}
	//LinkedHashMap()  两种增强 for 的遍历方式,  有顺序 性
		public static void hashMap_3() {
			LinkedHashMap<String, person> map = new LinkedHashMap<String, person>();
			map.put("a", new person("张三", 1));
			map.put("b", new person("李四", 2));
			map.put("b", new person("李四", 2));
			map.put("c", new person("王五", 3));
			System.out.println(map.keySet()); // [b, c, a]
			// 增强 for  ， map.keySet() 版
			for(String key : map.keySet()) {
				person value = map.get(key);
				System.out.println(key+"....."+value);
				//b.....person [name=李四, age=2]
				//c.....person [name=王五, age=3]
				//a.....person [name=张三, age=1]
			}
			System.out.println("=========增强 for map.entrySet() 版 ========");
			for(Map.Entry<String, person> entry : map.entrySet()) {
				String key = entry.getKey();
				person value = entry.getValue();
				System.out.println(key+"....."+value);
				//b.....person [name=李四, age=2]
				//c.....person [name=王五, age=3]
				//a.....person [name=张三, age=1]
			}
		} 
	//hashMap()  两种增强 for 的遍历方式
	public static void hashMap_2() {
		HashMap<String, person> map = new HashMap<String, person>();
		map.put("a", new person("张三", 1));
		map.put("b", new person("李四", 2));
		map.put("c", new person("王五", 3));
		System.out.println(map.keySet()); // [b, c, a]
		// 增强 for  ， map.keySet() 版
		for(String key : map.keySet()) {
			person value = map.get(key);
			System.out.println(key+"....."+value);
			//b.....person [name=李四, age=2]
			//c.....person [name=王五, age=3]
			//a.....person [name=张三, age=1]
		}
		System.out.println("=========增强 for map.entrySet() 版 ========");
		for(Map.Entry<String, person> entry : map.entrySet()) {
			String key = entry.getKey();
			person value = entry.getValue();
			System.out.println(key+"....."+value);
			//b.....person [name=李四, age=2]
			//c.....person [name=王五, age=3]
			//a.....person [name=张三, age=1]
		}
	} 
	
	// Map 集合遍历，使用 EntrySet 
	public static void EntrySet_1() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		// 1,调用map集合方法entrySet() 将集合中的映射关系对象，存储到Set 集合
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		// 使用  迭代器 ，转换成可以遍历的 对象
		Iterator<Map.Entry<String, Integer>> it = set.iterator();
		// while 方式实现
//		while(it.hasNext()) {
//			//3, 获取出来的集合元素 是 映射 关系对象
//			// it.next(); 获取到的是 entry 对象
//			Map.Entry<String, Integer> entry = it.next();
//			// 通过 getKey , getValue获取键值对
//			String key = entry.getKey();
//			int value = entry.getValue();
//			System.out.println(key+"----"+value);
//			//b----2
//			//c----3
//			//a----1
//		}
		// for 循环方式实现
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"----"+entry.getValue());
			//b----2
			//c----3
			//a----1
		}
	}
	// map.keySet()  使用keySet 遍历 Map 集合
	public static void keySet_1() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		
		// 调用map 集合的 keySet(), 将所有键存储在 Set 集合中
		Set<Integer> set = map.keySet();
		// 使用 set.integer() 对象得到，能够遍历的对象
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			int key = it.next();
			String value = map.get(key);
			System.out.println(key+"...."+value);
			//1....a
			//2....b
			//3....c
			//4....d
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// get() 向Map 集合连取数据， 返回键对应的 值
	public static void mapGet_1() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		
		System.out.println(map);       // {1=a, 2=b, 3=c}
		System.out.println(map.get(2));// b
	}
	
	// put() 向 Map 里面放数据 
	public static void hashMap_1() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("b", 5); // 键值一样 覆盖掉
		map.put("c", 3);
		int a = map.put("c", 4);
		System.out.println(a); // 3   返回值是 覆盖前的 数据
		
		System.out.println(map);  // {b=5, c=4, a=1}
		
	}
	//LinkedHashSet 是基于 hashSet 实现的。它具有顺序行
	public static void LinkedHashSet_1() {
		LinkedHashSet<String> link = new LinkedHashSet<String>();
		link.add("aa");
		link.add("bb");
		link.add("cc");
		link.add("cc");
		link.add("cc");
		link.add("cc");
		link.add("dd");
		System.out.println(link.hashCode()); // 12608
	}
	
	// Iterator 迭代器 并发修改异常
	public static void iterator_2() {
		ArrayList<String> str = new ArrayList<String>();
		str.add("aa");
		str.add("bb");
		str.add("cc");
		str.add("dd");
		str.isEmpty()
		Iterator<String> it = str.iterator();
		while(it.hasNext()) {
			String s = it.next();
			if(s.equals("bb")) {
				str.add("BB"); // java.util.ConcurrentModificationException
			}
			System.out.println(s);
		}
	}
	
	// set(int index, "修改成的元素")
	public static void set_1() {
		ArrayList<String> str = new ArrayList<String>();
		str.add("aa");
		str.add("bb");
		str.add("cc");
		str.add("dd");

		System.out.println(str); // [aa, bb, cc, dd]
		str.set(1, "11");
		System.out.println(str); // [aa, 11, cc, dd]
	}
	// remove(int index)
	public static void remove_1() {
		ArrayList<String> str = new ArrayList<String>();
		
		str.add("aa");
		str.add("bb");
		str.add("cc");
		str.add("dd");
		
		System.out.println(str);  // [aa, bb, cc, dd]
		str.remove(1);  // 返回值是 删除的指定元素
		System.out.println(str); // [aa, cc, dd]  删除完毕的 元素集合
	}
	public static void add_1() {
		ArrayList<String> str = new ArrayList<String>();
		
		str.add("aa");
		str.add("bb");
		str.add("cc");
		str.add("dd");
		
		System.out.println(str); // [aa, bb, cc, dd]
		str.add(1, "11");
		System.out.println(str); // [aa, 11, bb, cc, dd]
		System.out.println(str.get(3)); // cc
		
	}
}
