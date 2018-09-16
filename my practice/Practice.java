import java.util.*;
class Practice{
	public static void main(String[] args){
		int i;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		int sum1=0;
		int sum2=0;
		for (i=0;i<n;i++){
			arr[i]=s.nextInt();
			if (arr[i]%2==0){
				sum1=sum1+arr[i];
			}
			else {
               sum2=sum2+arr[i];
			}

			
			//System.out.println(arr[i]+" ");
			
		}
		//for (i=0;i<n;i++){
		System.out.println("Even numbers sum is"+sum1);
		System.out.println("odd numbers sum is"+sum2);

	//}
		// int num = s.nextInt();
		// num = num+1;
		// System.out.println(num);

	}
}
