/**.
    * Author : prathyusha.
    * date : 30/08/18
*/
import java.util.Scanner;
/**.
    * scanner function for taking user input
*/
public final class Solution {
    /**.
     Fill the main function to add two matrices
    */
    private Solution() {
        //constructor
    }
    /**.
        * @param args of type string : command line arguments
    */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k, l;
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int p = sc.nextInt();
        int q = sc.nextInt();
        int[][] b = new int[p][q];
        int[][] c = new int[m][q];
        for (k = 0; k < p; k++) {
            for (l = 0; l < q; l++) {
                b[k][l] = sc.nextInt();   
            }
        }
        if (m == p && n == q) {
            String res = " ";
            for (i = 0; i < m; i++) {
                for (l = 0; l < n; l++) {
                    c[i][l] = a[i][l] + b[i][l];
                    res += c[i][l] + " ";
                }
                res = res.trim() + "\n";
            }
            System.out.println(res);
        } else {
            System.out.println("not possible");
        }   
    }
}
