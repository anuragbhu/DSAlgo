import java.util.*;
// *	*	*	*	*	
// 		*	*	*	*	
// 				*	*	*	
// 						*	*	
// 								*	


public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern1(n);
	}

	private static void pattern1(int n) {
		// For number of lines
		for(int i = 0; i < n; i++) {
			// For deciding spaces using tab
			for(int j = 0; j < i*2; j++) {
				System.out.print("\t");
			}
			// For number of times printing stars in a line
			for(int j = i; j < n; j++) {
				System.out.print("*\t");
			}
			// After completing one line. Makes new Line
			System.out.println();
		}
	}
}