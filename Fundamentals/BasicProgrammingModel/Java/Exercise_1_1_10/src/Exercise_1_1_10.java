
public class Exercise_1_1_10 {
	public static void main(String[] args) {
		//int[] a; // Arrays are objects and therefore require dynamic allocation.
		           // Use of it below results in not-initialised compiler error.
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = i * i;
		}
	}
}
