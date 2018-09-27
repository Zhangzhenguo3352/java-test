package cn.carstDemo09;

public class Test {
	public static void main(String[] args) {
		computer com = new computer();
		com.openComputer();
		
		Mouse m = new Mouse();
		Keyboard k = new Keyboard();
		com.useUSB(m);
		com.useUSB(k);
	}
}
