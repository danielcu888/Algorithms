
public class Exercise_1_1_6 {
	// Prints out entries 3->17 of the Fibonacci sequence.
	public static void main(String[] args) {
		int f = 0;
		int g = 1;
		for (int i = 0; i <= 15; i++) {
			System.out.println(f);
			f = f + g; // f1 = f0 + g0
			g = f - g; // g1 = f1 - g0 = f0 + g0 - g0 = f0
		}
	}
}
