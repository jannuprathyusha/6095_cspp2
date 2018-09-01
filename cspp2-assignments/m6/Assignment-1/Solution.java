import java.util.Scanner;
/**
 * Write a java program to find the odd composite numbers
 * between 2 and n where n is given as an input.
 *
 * @author : 
 */
public final class Solution {
    /**
    * Empty constructor.
    */
    private Solution() {
        //not used
    }
    /**
     * Prints the odd composite numbers between 2 and n.
     *
     * @param      n     n value
     */
    static void oddComposites(final int n) {
    // write your code here
        int i,count=0;
        for(i = 2;i < n;i++) {
            if(i%2 != 1){
                for(int j=1;j <= n;j++) {
                    if(i%j == 0) {
                        count+=1;
                    }
                }
                if(count > 2)
                    System.out.println(i);
            }
        
    }
        
    }
    /**
    * main method as driver program.
    * @param args is the parameter for this method
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        oddComposites(n);
    }
}


