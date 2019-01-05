import java.util.Scanner;
import java.util.Arrays;
class Quiz {
	Question[] questions;
	Question[] options;
	int size;
	Quiz(){
      size = 0;
      questions = new Question[50];
	}
  public addQuestion(String question,String[] options) {
       questions[size] = question;
       ++size;
       for(int i=0; i<options.length; i++){
           options[i] = options;
       }
  }
  public int size(){
  	return size;
  }
  public Question getQuestion(int n){
        return questions[n];
    }
   public String getText()	{
        return String;
   }
   public String toString(){

   }
   public String commonSelectedOption(){
    	int option0Response = 0;
    	int option1Response = 0;
    	int option2Response = 0;
    	int option3Response = 0;
    	for(int i=0; i<options.length;i++){
    		if(p.response.equals(options[0])){
             ++option0Response;
    	}
    	else if(p.response.equals(options[1])) {
           ++option1Response;
    	}
    	else if(p.response.equals(options[2])){
           ++option2Response;
    	}
    	else if(p.response.equals(options[3])){
           ++option3Response;
    	}
    }
    if(option0Response>option1Response>option2Response>option3Response){
    	return options[0];
    	}
    else if(option1Response>option0Response>option2Response>option3Response){
        return options[1];
    }
    else if(option2Response>option0Response>option2Response>option3Response){
        return options[2];
    }
    else if(option3Response>option0Response>option2Response>option3Response){
        return options[3];
    }

    }
}