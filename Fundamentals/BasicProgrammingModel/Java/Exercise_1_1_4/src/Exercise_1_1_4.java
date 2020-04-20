public class Exercise_1_1_4 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c;
		
		// Statement a.
		//if (a > b) then c = 0; // Invalid because 'then' is not a keyword.
		
		// Statement b.
		// if a > b { c = 0; } // invalid since branch logic needs to be bounded by parentheses.
		
		// Statement c.
		if (a > b) c = 0; // valid, assuming a and b are initialised.
		
		// Statement d.
		//if (a > b) c = 0 else b = 0; // invalid. First assignment statement requires termination by semi colon.
	}
}
