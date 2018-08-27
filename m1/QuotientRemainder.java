import java.util.*;
public class QuotientRemainder{
	public static void main(String[]args)
	{
	Scanner a=new Scanner(System.in);
	Scanner b=new Scanner(System.in);
	int p=a.nextInt();
	int q=b.nextInt();
	int quo,rem;
	quo=p/q;
	rem=p%q;
	System.out.println(quo);
	System.out.println(rem);
	}

	
}