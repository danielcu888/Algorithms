
public class Exercise_1_1_11 {
	private void print(boolean[][] a) {
		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a[i].length; ++j) {
				System.out.print((a[i][j] ? '*' : ' ')+ " ");
			}
			System.out.println();
		}
	}
	}
