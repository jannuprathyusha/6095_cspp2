import java.util.Scanner;
import java.util.Arrays;
class Quiz {
	Question[] questions;
	int size;
	Quiz(){
      size = 0;
      questions = new Question[50];
	}
  public void addQuestion(Question q) {
       questions[size] = q;
       ++size;
  }
  public int size(){
  	return size;
  }
   public Question getQuestion(int n){
        return questions[n];
    }
}