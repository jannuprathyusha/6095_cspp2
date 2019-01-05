import java.util.Scanner;
import java.util.Arrays;
class Participant {
	int questionNumber;
	String name;
	String response;
	Participant(){

	}
	Participant(String name,int questionNumber,String response){
          this.name = name;
          this.questionNumber = questionNumber;
          this.response = response;
	}
	
}