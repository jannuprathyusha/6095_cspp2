import java.util.*;
public class Solution {
 	/**
 	*Fill this main function to print maximum of given array.
	*/
	   private Solution() {
	   	//This sis a constructor.
	   }
	   /**
	   * @param args of the program.
	   */
	public static void main( final String[] args ) {
		/**
		* main function
		*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort( arr );
		Arrays.toString( arr );

	
	System.out.println( arr[arr.length-1] );

		

	}
}
