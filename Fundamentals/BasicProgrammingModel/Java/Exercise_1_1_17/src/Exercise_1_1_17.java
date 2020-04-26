
public class Exercise_1_1_17 {
	public static String exR2(int n) {
		String s = exR2(n-3) + n + exR2(n-2) + n;
		if (n <= 0) return ""; // Base case placed after recursion relation
							   // resulting in stack overflow error.
		return s;
	}
}
