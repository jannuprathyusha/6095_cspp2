import java.util.Scanner;
/**missing doc.
*/
public final class Solution {
    /** the program is to find the roots.
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
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        roots(a, b, c);
    }
    /**
    *Need to write the rootsOfQuadraticEquation function and print the output.
    *@param a int
    *@param b int
    *@param c int
    */
    public static void roots(final int a, final int b, final int c) {
        double d = (b * b) - (2 * 2 * a * c);
        double qu = Math.sqrt(d);
        double r1 = ((-b + qu) / (2 * a));
        double r2 = ((-b - qu) / (2 * a));
        System.out.println(r1 + " " + r2);
    }
}



