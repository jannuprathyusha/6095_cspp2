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
    *@param a int
    *@param b int
    */
    public static int gcd(final int a, final int b) {
        if (a == 0 && b != 0) {
            return b;
        }
        if (a != 0 && b == 0) {
            return a;
        }
        if (a == b) {
            return a;
        }
        if (a > b) {
            return gcd(a - b, b);
        }
        return gcd(a, b - a);
    }
}


