// Link: https://www.pepcoding.com/resources/online-java-foundation/patterns/pattern-type-4-official/ojquestion
// TC = O(n^2) SC = O(n)

import java.util.*;

public class Pattern4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        
        for(int i = 1; i <= n; i++) {
            
            for(int j = 1; j < i; j++) {
                System.out.print("\t"); // spaces
            }
            for(int j = i; j <= n; j++) {
                System.out.print("*\t"); // stars
            }
            System.out.println();
            
        }

    }
}
