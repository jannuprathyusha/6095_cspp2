import java.util.Scanner;
/**Do not modify this main function.
*/
public final class Solution {
    /** The program is to find GCD.
    */
     private Solution() {
    /** this is a constructor.
    */
    }
    /**
    Do not modify this main function.
    *@param args String
    */
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        gcd(n1, n2);
        System.out.println(gcd(n1, n2));
    }
    /**
    *Need to write the gcd function and print the output.
    *@param numberOne int
    *@param numberTwo int
    *@return a argument
    */
    public static int gcd(final int numberOne, final int numberTwo) {
        if (numberOne == 0 && numberTwo != 0) {
            return numberTwo;
        }
        if (numberOne != 0 && numberTwo == 0) {
            return numberOne;
        }
        if (numberOne == numberTwo) {
            return numberOne;
        }
        if (numberOne > numberTwo) {
            return gcd(numberOne - numberTwo, numberTwo);
        }
        return gcd(numberOne, numberTwo - numberOne);
    }
}

