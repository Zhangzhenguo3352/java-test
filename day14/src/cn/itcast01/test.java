package cn.itcast01;

	import static java.lang.System.out; // ��ĩβ������һ�� ��̬��Ա����
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
//		getSum_2(1,2,"�ַ���", new preson());
		HashMap_1();
	}
	// Map ���Ƕ�� , ����� Ƕ����
	public static void HashMap_1() {
		HashMap<String, String> javase = new HashMap<String, String>();
		HashMap<String, String> javaee = new HashMap<String, String>();
		
		javase.put("001", "����");
		javase.put("002", "����");
		
		javaee.put("001", "����");
		javaee.put("002", "����");
		
		HashMap<String, HashMap<String, String>> csdk = new HashMap<String, HashMap<String, String>>();
		csdk.put("������", javase);
		csdk.put("��ҵ��", javaee);
		
		keySet_1(csdk);
	}
	// ʹ��  keySet() ����
	public static void keySet_1(HashMap<String, HashMap<String, String>> csdk) {
		// ����csdk���Ϸ��� keySet,�����洢�� Set ����
		System.out.println(csdk.keySet());  // [��ҵ��, ������]
		Set<String> classNameSet = csdk.keySet();
		// ����Set ���ϣ� ʹ�� ������
		Iterator<String> classNameIt = classNameSet.iterator();		
		while(classNameIt.hasNext()) {
			//classNameIt.next() ��ȡ������ ��Set����Ԫ�ص� key, ��
			String classNameKey = classNameIt.next();
			
			HashMap<String, String> classMap = csdk.get(classNameKey);
			// ʹ��keySet() �����洢�� Set ������
			Set<String> studentNum = classMap.keySet();
			// Map  ���� ʹ�� Iterator  ת���� ���Ա����Ķ���
			Iterator<String> student = studentNum.iterator();
			while(student.hasNext()) {
				String numKey = student.next();
				String nameValue = classMap.get(numKey);
				System.out.println(numKey+"...."+nameValue);
				// 001....����
				// 002....����
				// 001....����
				// 002....����
			}
		}
	}
	
	//Collections.shuffle �Լ����е�Ԫ�� �������
	public static void shuffle_1() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(9);
		list.add(90);
		list.add(19);
		list.add(92);
		list.add(99);
		
		System.out.println(list);
		// shuffle ������� ����
		Collections.shuffle(list);
		System.out.println(list);
	}
	
	// binarySearch(list, 16) 
	// �����Ҳ���ʱ �����Ĳ���� �� һ
	public static void binarySearch_1() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(6);
		list.add(1);
		list.add(3);
		list.add(8);
		int index = Collections.binarySearch(list, 2);
		System.out.println(index); // -3
	}
	// Collections �� �����·�����ʹ��
	public static void CollacrionsSort() {
		List<String> list = new ArrayList<String>();
		list.add("zse");
		list.add("asb");
		list.add("bed");
		System.out.println(list); // [zse, asb, bed]
		//ʹ��Collections.sort() �µ� sort���� ����
		Collections.sort(list);
		System.out.println(list);  // [asb, bed, zse]
	}
	
	// ... �ɱ���� ��ʹ������
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
			//�ַ���
			//cn.itcast01.preson@b9e45a
		}
	}
}