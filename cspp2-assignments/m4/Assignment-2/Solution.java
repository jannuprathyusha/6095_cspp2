import java.util.*;
public class Solution {
	/* Fill the main function to print resultant of addition of matrices*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,k,l;
		int m= sc.nextInt();
		int n= sc.nextInt();
		
		int[][] a=new int[m][n];
		
		for (i=0;i<m;i++){
			for (j=0;j<n;j++){
				a[i][j]=sc.nextInt();
			}
		}
		int p= sc.nextInt();
		int q= sc.nextInt();
		int[][] b=new int[p][q];
		int[][] c=new int[m][q];
		for (k=0;k<p;k++){
			for (l=0;l<q;l++){
				b[k][l]=sc.nextInt();
				
			}
		}
		if(m==p && n==q){
			for (i=0;i<m;i++){
			for (l=0;l<n-1;l++){
		         c[i][l]=a[i][l]+b[i][l];
		         System.out.print(c[i][l-1]+" ");
	                }
	         
	                System.out.println(c[i][l-1]);

}


		}
		else{
			System.out.println("not possible");
		}	

	}
}