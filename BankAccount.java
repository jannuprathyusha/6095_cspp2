// class Students {
// 	String firstName;
// 	String lastName;
// 	int classYear;
// 	String major;
// 	public Students (String firstName, String lastName, int classYear, String major) {
// 	    this.firstName = firstName;
//         this.lastName = lastName;
//         this.classYear = classYear;
//         this.major = major;	
// 	}
    
//     public static void main(String[] args) {
//     	Students s1 = new Students(String firstName, String lastName, int classYear, String major);
//     	Students s2 = new Students(String firstName, String lastName, int classYear, String major);
//     }

// }
// class Planets {
// 	String name;
// 	double distance;
// 	double gravity;
// 	public Planets (String name, double distToSun, double relGravity) {
//     this.name = name;
//     this.distance = distToSun;
//     this.gravity = relGravity;
//   }
//   public static void main(String[] args) {
//       Planets earth = new Planets(String name, double distToSun, double relGravity);
// 	  Planets venus = new Planets(String name, double distToSun, double relGravity);	
//   }
	
// }

class BankCustomer {
  String firstName;
  String lastName;

  BankCustomer (String f, String l) {
    this.firstName =f;
    this.lastName = l;
  }
  public String getfirstName(){
  	return this.firstName;
  }
  public String getLastName(){
  	return this.lastName;
  }

}

class BankAccount {
	public static void main(String[] args) {
		BankCustomer forCust= new BankCustomer("vineetha","mallu");
        System.out.println(forCust.getfirstName());
        System.out.println(forCust.getLastName());
	}

  
   }

