import java.util.*;
// *	*	*	*	*	
// *				*
// *				*
// *				*
// *	*	*	*	*	

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern3(n);
	}

	private static void pattern3(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
		for(int i = 0; i < n-1; i++) {
			for(int j = i; j < n-1; j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
		
	}
}