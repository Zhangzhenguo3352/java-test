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
	//LinkedHashMap()  ������ǿ for �ı�����ʽ,  ��˳�� ��
		public static void hashMap_3() {
			LinkedHashMap<String, person> map = new LinkedHashMap<String, person>();
			map.put("a", new person("����", 1));
			map.put("b", new person("����", 2));
			map.put("b", new person("����", 2));
			map.put("c", new person("����", 3));
			System.out.println(map.keySet()); // [b, c, a]
			// ��ǿ for  �� map.keySet() ��
			for(String key : map.keySet()) {
				person value = map.get(key);
				System.out.println(key+"....."+value);
				//b.....person [name=����, age=2]
				//c.....person [name=����, age=3]
				//a.....person [name=����, age=1]
			}
			System.out.println("=========��ǿ for map.entrySet() �� ========");
			for(Map.Entry<String, person> entry : map.entrySet()) {
				String key = entry.getKey();
				person value = entry.getValue();
				System.out.println(key+"....."+value);
				//b.....person [name=����, age=2]
				//c.....person [name=����, age=3]
				//a.....person [name=����, age=1]
			}
		} 
	//hashMap()  ������ǿ for �ı�����ʽ
	public static void hashMap_2() {
		HashMap<String, person> map = new HashMap<String, person>();
		map.put("a", new person("����", 1));
		map.put("b", new person("����", 2));
		map.put("c", new person("����", 3));
		System.out.println(map.keySet()); // [b, c, a]
		// ��ǿ for  �� map.keySet() ��
		for(String key : map.keySet()) {
			person value = map.get(key);
			System.out.println(key+"....."+value);
			//b.....person [name=����, age=2]
			//c.....person [name=����, age=3]
			//a.....person [name=����, age=1]
		}
		System.out.println("=========��ǿ for map.entrySet() �� ========");
		for(Map.Entry<String, person> entry : map.entrySet()) {
			String key = entry.getKey();
			person value = entry.getValue();
			System.out.println(key+"....."+value);
			//b.....person [name=����, age=2]
			//c.....person [name=����, age=3]
			//a.....person [name=����, age=1]
		}
	} 
	
	// Map ���ϱ�����ʹ�� EntrySet 
	public static void EntrySet_1() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		// 1,����map���Ϸ���entrySet() �������е�ӳ���ϵ���󣬴洢��Set ����
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		// ʹ��  ������ ��ת���ɿ��Ա����� ����
		Iterator<Map.Entry<String, Integer>> it = set.iterator();
		// while ��ʽʵ��
//		while(it.hasNext()) {
//			//3, ��ȡ�����ļ���Ԫ�� �� ӳ�� ��ϵ����
//			// it.next(); ��ȡ������ entry ����
//			Map.Entry<String, Integer> entry = it.next();
//			// ͨ�� getKey , getValue��ȡ��ֵ��
//			String key = entry.getKey();
//			int value = entry.getValue();
//			System.out.println(key+"----"+value);
//			//b----2
//			//c----3
//			//a----1
//		}
		// for ѭ����ʽʵ��
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"----"+entry.getValue());
			//b----2
			//c----3
			//a----1
		}
	}
	// map.keySet()  ʹ��keySet ���� Map ����
	public static void keySet_1() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		
		// ����map ���ϵ� keySet(), �����м��洢�� Set ������
		Set<Integer> set = map.keySet();
		// ʹ�� set.integer() ����õ����ܹ������Ķ���
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// get() ��Map ������ȡ���ݣ� ���ؼ���Ӧ�� ֵ
	public static void mapGet_1() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		
		System.out.println(map);       // {1=a, 2=b, 3=c}
		System.out.println(map.get(2));// b
	}
	
	// put() �� Map ��������� 
	public static void hashMap_1() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("b", 5); // ��ֵһ�� ���ǵ�
		map.put("c", 3);
		int a = map.put("c", 4);
		System.out.println(a); // 3   ����ֵ�� ����ǰ�� ����
		
		System.out.println(map);  // {b=5, c=4, a=1}
		
	}
	//LinkedHashSet �ǻ��� hashSet ʵ�ֵġ�������˳����
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
	
	// Iterator ������ �����޸��쳣
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
	
	// set(int index, "�޸ĳɵ�Ԫ��")
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
		str.remove(1);  // ����ֵ�� ɾ����ָ��Ԫ��
		System.out.println(str); // [aa, cc, dd]  ɾ����ϵ� Ԫ�ؼ���
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