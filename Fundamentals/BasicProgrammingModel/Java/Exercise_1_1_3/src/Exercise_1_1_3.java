import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Exercise_1_1_3 {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		final int[] data = new int[3];
		try {
			for (int i = 0; i < 3; ++i) {
				data[i] = sc.nextInt();
			}
			
			System.out.print("All three integers are ");
			if (!((data[0] == data[1]) && (data[1] == data[2]))) {
				System.out.print("not");
			}

			System.out.println(" equal.");
		} catch (InputMismatchException exc) {
			System.out.println("You must enter only integers: " + exc.getMessage());
		} catch (NoSuchElementException exc) {
			System.out.println("Data not found: " + exc.getMessage());
		} catch (IllegalStateException exc) {
			System.out.println("Illegal state: " + exc.getMessage());
		} catch (Exception exc) {
			System.out.println("Caught unknown exception: " + exc.getMessage());
		} finally {
			sc.close();
		}
	}
}
