import java.util.Scanner;
class Wallet{
	String name;
	double amount;
	
    Wallet(){
     
    }
}
 class User{
 	String name;
 	double amount;
 	String[] walletNames;
 	int size;
 	User(int n){
      walletNames = new String[n];
      size = 0;
 	}
    
 	public String getName(){
        return this.name;
 	}
 	public  void addWallet(String name){
 		walletNames[size] = name;
        ++size;
 	}
 	public void setName(){
        this.name = name;
 	}
 }

public class Solution {
	public static void main(String args[]) {
        double totalAmount = 1000;
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		int c = 0;
		int num = Integer.parseInt(s.nextLine());
		User u = new User(num);
		u.name = name;
		for (int i = 0; i < num; i++) {
			u.addWallet(s.nextLine());
		}
		c = 0;
		int flag = 0;
		while (s.hasNext()) {
			String operation = s.nextLine();
			if (operation.equals("quit")) {
				System.out.println("Thank you");
				break;
			}
			switch (operation) {
				//Please complete the code for credit,debit,transfer and balance operations 
			case "credit":
				String[] tokens = s.nextLine().split(" ");
				double creditAmount = Integer.parseInt(tokens[1]);
				if(creditAmount < 0){
					System.out.println("Negative amount");
				}
				totalAmount = totalAmount + creditAmount;
				break;
			case "transfer":
				
				break;

			case "debit":
				String[] tokens1 = s.nextLine().split(" ");
				double debitAmount = Integer.parseInt(tokens1[1]);
				if(debitAmount < 0){
					System.out.println("Negative amount");
				}
				if(debitAmount > totalAmount){
					System.out.println("Insufficient funds");
				}
				totalAmount = totalAmount - debitAmount;
				break;
			case "balance":
				String walletName = s.nextLine();
				for(int i=0; i<num; i++){
					if(u.walletNames[i].equals(walletName)){
					System.out.println(totalAmount);
				}
			 }
			 
			break;
		}
		}
	}
}
