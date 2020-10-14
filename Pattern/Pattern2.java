import java.util.*;
// *	*	*	*	*	
// *				*
// *				*
// *				*
// *	*	*	*	*	

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern2(n);
	}

	private static void pattern2(int n) {
		// For printing first line
		for(int i = 0; i < n; i++) {
			System.out.print("*\t");
		}
		// For making cursor goes to next line
		System.out.println();
		// For printing remaining next (n-2) lines
		for(int i = 0; i < n-2; i++) {
			// For printing first star of the line
			System.out.print("*\t");
			for(int j = 0; j < n-2; j++) {
				// For making (n-2) spaces (excluding first and last star)
				System.out.print("\t");
			}
			// For printing last star of the line and making cursor goes to next line
			System.out.print("*\n");
		}
		// For printing last line
		for(int i = 0; i < n; i++) {
			System.out.print("*\t");
		}
		// For making cursor goes to next line
		System.out.println();
	}
}