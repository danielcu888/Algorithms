
public class Exercise_1_1_18 {
	// For each iteration where b > 0, add
	// a to the result of the next iteration
	// if b is odd or return that result otherwise.
	// The next iteration has a value of
	// mystery(2*a, b/2).
	public static int mystery(int a, int b) {
		if (b == 0) return 0;
		if (b % 2 == 0) return mystery(a+a, b/2);
		return mystery(a+a, b/2) + a;
	}

	// For each iteration where b > 0, multiply
	// a by the result of the next iteration
	// if b is odd or return that result otherwise.
	// The next iteration has a value of
	// mystery(2*a, b/2).
	public static int mystery2(int a, int b) {
		if (b == 0) return 1;
		if (b % 2 == 0) return mystery2(a*a, b/2);
		return mystery2(a*a, b/2) * a;
	}

	public static void main(String[] args) {
		System.out.println(mystery(2, 25)); // mystery(4,12) + 2
											// mystery(8,6) + 2
											// mystery(16,3) + 2
											// mystery(32,1) + 16 + 2
											// mystery(64,0) + 32 + 16 + 2
											// 50
		System.out.println(mystery(3, 11)); // mystery(6,5) + 3
											// mystery(12,2) + 6 + 3
											// mystery(24, 1) + 6 + 3
											// mystery(48, 0) + 24 + 6 + 3
											// 33
		
		System.out.println(mystery2(2, 25)); // mystery(4,12) * 2
											 // mystery(16, 6) * 2
											 // mystery(256, 3) * 2
											 // mystery(256*256, 1) * 256 * 2
											 // 256 * 256 * 256 * 2
											 // 33554432
		System.out.println(mystery2(3, 11)); // mystery(9,5) * 3
											 // mystery(81,2) * 9 * 3
											 // mystery(81*81,1) * 9 * 3
											 // 81*81*9*3
											 // 177147
		
	}
}
