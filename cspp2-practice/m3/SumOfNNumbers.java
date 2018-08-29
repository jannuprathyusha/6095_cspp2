import java.util.*;
public class SumOfNNumbers{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int s = sum(a);
		System.out.println(s);
	}
	public static int sum(int n){
		int sum=0,i;
		for(i=1;i<=n;i++){
			sum=sum+i;
		}
		return sum;
	}
}