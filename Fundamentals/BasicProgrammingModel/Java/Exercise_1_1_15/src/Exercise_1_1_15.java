
public class Exercise_1_1_15 {
	int[] histogram(int[] a, int M) {
		int[] ret = new int[M];
		for (int i = 0; i < a.length; ++i) {
			final int x = a[i];
			if (x >= 0 && x < M) {
				++ret[x];
			}
		}
		return ret;
	}
}
