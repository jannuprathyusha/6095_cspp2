import java.util.Scanner;
import java.lang.Math;
public class Solution {
	/*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		rootsOfQuadraticEquation(a, b, c);
	}
	/*
	Need to write the rootsOfQuadraticEquation function and print the output.
	*/
	public static void rootsOfQuadraticEquation(int a,int b,int c)
	{
		double d = (b * b) - (4* a *c);
		double qu=Math.sqrt(d);
		double r1 = ((- b + qu) / (2 * a));
		double r2 = ((- b - qu) / (2 * a));
		System.out.println(r1 + " " +r2);
	}
}
