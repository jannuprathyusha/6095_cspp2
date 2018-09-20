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
        int numberOne = scan.nextInt();
        int numberTwo = scan.nextInt();
        int numberThree = scan.nextInt();
        roots(numberOne, numberTwo, numberThree);
    }
    /**
    *Need to write the rootsOfQuadraticEquation function and print the output.
    *@param numberOne int
    *@param numberTwo int
    *@param numberThree int
    */
    public static void roots(final int numberOne,
            final int numberTwo, final int numberThree) {
        double d = (numberTwo * numberTwo) - (2 * 2 * numberOne * numberThree);
        double qu = Math.sqrt(d);
        double rootOne = ((-numberTwo + qu) / (2 * numberOne));
        double rootTwo = ((-numberTwo - qu) / (2 * numberOne));
        System.out.println(rootOne + " " + rootTwo);
    }
}
