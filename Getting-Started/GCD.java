import java.util.*;

public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// One act as dividend and other as divisor
		int a = sc.nextInt(); // divident
		int b = sc.nextInt(); // divisor
		gcdIterative(a, b);
		System.out.println(gcdRecursive(a, b));
	}

	private static void gcdIterative(int divident, int divisor) {
		// Sequence of instruction matters.
		// Long division method
		while(divident % divisor != 0) {
			int rem = divident % divisor;
			divident = divisor;
			divisor = rem;
		}
		System.out.println(divisor);
		// TC = O(log(min(a,b))) SC = O(1)
	}

	private static int gcdRecursive(int a, int b) {
		// Sequence of instruction matters.
		// Long division method
		if(b == 0) {
			return a;
		}
		return gcdRecursive(b, a%b);
		// TC = O(log(min(a,b))) SC = O(1)
	}
}