// Link: https://www.pepcoding.com/resources/online-java-foundation/getting-started/digits-of-a-number-official/ojquestion
import java.util.*;
    
public class DigitsOfANumber {
    
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        digitsOfANumber(n);
    }

    private static void digitsOfANumber(int n) {
        int power = 1;
        int temp = n;
        // For making power variable like for n = 31, power will be = 10
        // Note that temp >= 10
        while (temp >= 10) {
            temp /= 10;
            power *= 10;
        }

        temp = n;
        while(power != 0){
            int digit = temp / power; // For extracting most significant digit.
            System.out.println(digit);

            temp = temp % power; // For removing most significant digit.
            power = power / 10;
        }
        // TC = O(n) SC = O(1)
    }
}
