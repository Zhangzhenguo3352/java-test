package cn.itcast04;

public class test {

	/**
	 * @param args
	 * split ��ϰ
	 */
	public static void main(String[] args) {
		matches_1();
	}
	// ������֤
	public static void matches_1() {
		String email = "13012113210@163.cn";
		boolean b = email.matches("[a-zA-Z0-9_]+@[a-z0-9]+(\\.[a-z]+)+");
		System.out.println(b);
	}
	// replaceAll ���������������滻�� ������Ԫ��
	public static void replaceAll_1() {
		String str = "jjssww9999ddd8d";
		str = str.replaceAll("[\\d]+", "@");
		System.out.println(str);
	}
	
	// split �� ���� һ���ո� ���� ����ո���
	public static void split_2() {
		String str = "12      13 15     16";
		String[] strArr = str.split(" +");
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}
	public static void split_1() {
		String str = "12-13-15-16";
		String[] strArr = str.split("-");
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}

}
