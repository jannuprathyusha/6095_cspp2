import java.util.*;
class Practice{
	public static void main(String[] args){
		int i;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		//int[] arr = new int[n];
		int temp;
		int sum1=0;
		int sum2=0;
		for (i=0;i<n;i++){
			temp=s.nextInt();
			if (temp%2==0){
				sum1=sum1+temp;
			}
			else {
               sum2=sum2+temp;
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
