
public class Exercise_1_1_13 {
	void printTransposition(Object[][] a) {
		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a[i].length; ++j) {
				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
	}
}
