
public class Exercise_1_1_12 {
	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < 10; i++)
			a[i] = 9 - i; // Stores 9,8,7,6,...
		for (int i = 0; i < 10; i++)
			a[i] = a[a[i]]; // Stores 0,1,2,3,4...
		for (int i = 0; i < 10; i++)
			System.out.println(i); // Prints 0\n1\n2\n3\n4...9
	}
}
