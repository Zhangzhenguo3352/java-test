package cn.itcast03;
/**
 * 
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		/**
		 * 这是 一个例子
		 */
		JavaEE ee = new JavaEE("张三", "99");
		
		ee.work();
		
		Net n = new Net("李四", "005");
		n.work();
	}
}
