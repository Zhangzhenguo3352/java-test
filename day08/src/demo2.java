public class demo2 {
	public static void main(String[] args) {
		int n = 10;
		getSum(n);
	}

	public static void getSum(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				sum = sum + 1;
			}
		}
		System.out.println(sum);
	}
}
