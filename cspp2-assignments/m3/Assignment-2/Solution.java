import java.util.Scanner;
/**Do not modify this main function.
*/
public final class Solution {
	/** The program is to find number of 7’s in between 1 and n.
    */
     private Solution() {
    /** this is a constructor.
    */
    }
    /**
    Do not modify this main function.
    *@param args String
    */
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);      
        int n = s.nextInt();
        int temp = 1, a;
        int count=0;
    	for(int i = 1; i <= n; i++)
    	{
    		temp = i;
    		while (temp != 0) {
    			a=temp % 10;
    			if(a == 7)
    				count = count + 1;
    			temp /= 10;
    			
    			}
    		}
    		System.out.println(count);
    	}
    	


    	}
