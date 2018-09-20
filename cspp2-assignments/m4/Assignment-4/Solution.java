import java.util.Scanner;
/**
 * { item_description }.
 */
public final class Solution {
/**
 * Constructs the object.
 */
    private Solution() {
        //function.
    }
    /**
     * @param givenString { parameter_description }.
     *
     * @return { description_of_the_return_value }.
     */
    static String reverseString(final String givenString) {
        /**
         * { var_description }.
         */
        String rev = "";
        for (int i = givenString.length() - 1; i >= 0; i--) {
            rev += givenString.charAt(i);
        }
        return (rev);
    }
    /**
     * @param      args  The arguments.
     */
    public static void main(final String[] args) {
        /**
         * { var_description }.
         */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);
    }
}
