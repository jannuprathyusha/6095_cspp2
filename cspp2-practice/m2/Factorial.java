import java.util.Scanner;
public class Factorial{
	public static void main(String[]args)
	{
		int n;
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		int fact=fac(n);
		System.out.println(fact);
	}
	public static int fac(int num)
	{
	 if(num==0)
	 {
	 	return 1;
	  }
	 else if(num==1)
	  {
	  	return 1;
	  }
	 else
	  {
	  	return num*fac(num-1);
	  }
	}
}