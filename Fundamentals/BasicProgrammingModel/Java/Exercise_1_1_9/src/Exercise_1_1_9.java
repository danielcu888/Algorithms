
public class Exercise_1_1_9 {
	
	private static String convertToBinaryString(int N) {
		
		if (N == 0) {
			return "0";
		}
		
		if (N < 0) {
			throw new IllegalArgumentException("Integer must be >= 0.");
		}
		
		StringBuilder sb = new StringBuilder();
		for (int n = N; n > 0; n /= 2) {
			sb.append(n % 2);
		}

		final String s = sb.toString();
		sb = new StringBuilder();
		final int len = s.length();
		for (int i = len-1; i >= 0; --i) {
			sb.append(s.charAt(i));
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		for (int i = 1; i < 10; ++i) {
			System.out.println(convertToBinaryString(i));
		}
	}
}
