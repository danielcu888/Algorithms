
public class Fibonacci {
	
	private static long[] a = {0,1};
	private static int max_idx = 1;
	
	public static long F2(int N) {
		
		if (N < 0) {
			throw new IllegalArgumentException("N must be >= 0.");
		}
		
		if (N > Fibonacci.max_idx) {			
			if (Fibonacci.a.length < N+1) {
				final long[] tmp = new long[2*(N+1)];
				for (int i = 0; i <= Fibonacci.max_idx; ++i) {
					tmp[i] = Fibonacci.a[i];
				}
				Fibonacci.a = tmp;
			}
			
			for (int i = Fibonacci.max_idx+1; i <= N+1; ++i) {
				Fibonacci.a[i] = Fibonacci.a[i-2] + Fibonacci.a[i-1];
			}
			
			Fibonacci.max_idx = N+1;
		}		
		
		return Fibonacci.a[N];
	}
		
	public static long F(int N) {
		if (N == 0) return 0;
		if (N == 1) return 1;
		return F(N-1) + F(N-2);
	}
	
	public static void main(String[] args) {
		for (int N = 0; N < 100; N++) {
			System.out.println(N + " " + F2(N));
		}
	}
}
