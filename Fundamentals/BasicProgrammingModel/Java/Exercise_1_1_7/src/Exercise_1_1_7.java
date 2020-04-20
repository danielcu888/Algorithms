
public class Exercise_1_1_7 {
	
	private static void funcA() {
		double t = 9.0;
		while (Math.abs(t - 9.0/t) > .001)
			t = (9.0/t + t) / 2.0;
		System.out.printf("%.5f\n", t);
	}
	
	private static void funcB() {
		int sum = 0;
		for (int i = 1; i < 1000; i++)
			for (int j = 0; j < i; j++)
				sum++;
		System.out.println(sum);
	}
	
	private static void funcC() {
		int N = 40;
		int sum = 0;
		for (int i = 1; i < 1000; i *= 2)
			for (int j = 0; j < N; j++)
				sum++;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		funcA(); // 3.00009
		funcB(); // 499500 (1000 * (1000 - 1) ) / 2
		funcC(); // 10 * N (chosen here to be 40).
	}
}
