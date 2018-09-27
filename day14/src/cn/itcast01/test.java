package cn.itcast01;

	import static java.lang.System.out; // 增末尾必须是一个 静态成员变量
	import java.util.List;
	import java.util.Collections;
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Set;
public class test {
	public static void main(String[] args) {
//		int sum = getSum(12,3);
//		System.out.println(sum); // 15
//		getSum_2(1,2,"字符串", new preson());
		HashMap_1();
	}
	// Map 结合嵌套 , 这个是 嵌套在
	public static void HashMap_1() {
		HashMap<String, String> javase = new HashMap<String, String>();
		HashMap<String, String> javaee = new HashMap<String, String>();
		
		javase.put("001", "张三");
		javase.put("002", "李四");
		
		javaee.put("001", "张三");
		javaee.put("002", "李四");
		
		HashMap<String, HashMap<String, String>> csdk = new HashMap<String, HashMap<String, String>>();
		csdk.put("基础班", javase);
		csdk.put("就业班", javaee);
		
		keySet_1(csdk);
	}
	// 使用  keySet() 遍历
	public static void keySet_1(HashMap<String, HashMap<String, String>> csdk) {
		// 调用csdk集合方法 keySet,将键存储到 Set 集合
		System.out.println(csdk.keySet());  // [就业班, 基础班]
		Set<String> classNameSet = csdk.keySet();
		// 迭代Set 集合， 使用 迭代器
		Iterator<String> classNameIt = classNameSet.iterator();		
		while(classNameIt.hasNext()) {
			//classNameIt.next() 获取出来的 是Set集合元素的 key, 键
			String classNameKey = classNameIt.next();
			
			HashMap<String, String> classMap = csdk.get(classNameKey);
			// 使用keySet() ，键存储到 Set 集合中
			Set<String> studentNum = classMap.keySet();
			// Map  对象 使用 Iterator  转换成 可以遍历的对象
			Iterator<String> student = studentNum.iterator();
			while(student.hasNext()) {
				String numKey = student.next();
				String nameValue = classMap.get(numKey);
				System.out.println(numKey+"...."+nameValue);
				// 001....张三
				// 002....李四
				// 001....张三
				// 002....李四
			}
		}
	}
	
	//Collections.shuffle 对集合中的元素 随机排列
	public static void shuffle_1() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(9);
		list.add(90);
		list.add(19);
		list.add(92);
		list.add(99);
		
		System.out.println(list);
		// shuffle 随机排列 集合
		Collections.shuffle(list);
		System.out.println(list);
	}
	
	// binarySearch(list, 16) 
	// 当查找不到时 ：负的插入点 减 一
	public static void binarySearch_1() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(6);
		list.add(1);
		list.add(3);
		list.add(8);
		int index = Collections.binarySearch(list, 2);
		System.out.println(index); // -3
	}
	// Collections 类 方法下方法的使用
	public static void CollacrionsSort() {
		List<String> list = new ArrayList<String>();
		list.add("zse");
		list.add("asb");
		list.add("bed");
		System.out.println(list); // [zse, asb, bed]
		//使用Collections.sort() 下的 sort方法 排序
		Collections.sort(list);
		System.out.println(list);  // [asb, bed, zse]
	}
	
	// ... 可变参数 的使用例子
	public static int getSum(int ...arg) {
		int sum = 0;
		for(int n : arg) {
			sum = sum+n;
		}
		return sum;
	}
	public static void getSum_2(Object...o) {
		for(Object item : o){
			System.out.println(item);
			//1
			//2
			//字符串
			//cn.itcast01.preson@b9e45a
		}
	}
}
