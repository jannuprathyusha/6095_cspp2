import java.util.*;
class AreaOfCircle{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		double ar=area(a);
		System.out.println(ar);

	}
	public static double area(int num){
		double pie=pi();
		double circlearea=pie*num*num;
		return circlearea;



	}
	public static double pi()
	{
		return 3.14;
	}

}