import java.util.Scanner;
public final class Solution {
    /**
    *Fill this main function to print maximum of given array.
    */
       private Solution() {
        //This sis a constructor.
       }
       /**
       * @param args of the program.
       */
    public static void main (final String[] args) {
        /**
        * main function
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] > max ) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
