import java.util.*;
public class Swap{
	public static void main(String[]args)
	{
	   Scanner a=new Scanner(System.in);
	   Scanner b=new Scanner(System.in);
	   int p=a.nextInt();
	   int q=b.nextInt();
	   int temp;
	   temp=p;
	   p=q;
	   q=temp;
	   System.out.println(p);
	   System.out.println(q);
	}

	
}