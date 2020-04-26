
public class Exercise_1_1_14 {
	private static int lg(int N) {
		int n = 0;
		while ((N /= 2) > 0)
		{
			++n;
		}
		
		return n;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; ++i) {
			System.out.println("i: " + i + ", lg(" + i + "): " + lg(i));
		}
	}
}
