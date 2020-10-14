// Link: https://www.pepcoding.com/resources/online-java-foundation/getting-started/fibonacci-till-n-official/ojquestion
import java.util.*;
  
public class PrintFibonacciNumbersTillN {

  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      printFibonacciNumbersTillN(n);
  }

  private static void printFibonacciNumbersTillN(int n){
    int a = 0;
      int b = 1;
      for(int i = 0; i < n; i++){
          System.out.println(a);
            int c = a + b;
            // Swapping
            a = b;
            b = c;
      }
  }
  // TC = O(n) SC = O(1)
}
