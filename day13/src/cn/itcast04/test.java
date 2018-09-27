package cn.itcast04;

public class test {

	/**
	 * @param args
	 * split 练习
	 */
	public static void main(String[] args) {
		matches_1();
	}
	// 邮箱验证
	public static void matches_1() {
		String email = "13012113210@163.cn";
		boolean b = email.matches("[a-zA-Z0-9_]+@[a-z0-9]+(\\.[a-z]+)+");
		System.out.println(b);
	}
	// replaceAll 将数字所有数字替换成 ，任意元素
	public static void replaceAll_1() {
		String str = "jjssww9999ddd8d";
		str = str.replaceAll("[\\d]+", "@");
		System.out.println(str);
	}
	
	// split 切 按照 一个空格 或者 多个空格切
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
