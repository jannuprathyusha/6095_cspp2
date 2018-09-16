import java.util.*;
class Practice{
	public static void main(String[] args){
		int i;
		Scanner s = new Scanner(System.in);
		//int n = s.nextInt();
		//String[] arr = new String[n];
		String str= s.next();
		int count=0;
		for (i=0;i<str.length();i++){
			if (str.charAt(i) == 'a'){
				count = count+1;
			}
			
			}
			System.out.println(count);
		}
	}