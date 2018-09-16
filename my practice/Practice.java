import java.util.*;
class Practice{
	public static void main(String[] args){
		int i;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		int min,max=0;
		for (i=0;i<n;i++){
			arr[i]=s.nextInt();
			if (arr[i]>max){
				max = arr[i];
			}
			


			}
			System.out.println(max);
			
	}
}
