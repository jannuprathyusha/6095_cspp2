import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Quiz quiz = new Quiz();
		int questions = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < questions; i++) {
			String question = scan.nextLine();
			String[] options = new String[4];
			for (int j = 0; j < options.length; j++) {
				options[j] = scan.nextLine();
			}
			quiz.addQuestion(new Question(question, options));
		}

		int participants = Integer.parseInt(scan.nextLine());
		for (int k = 0; k < participants; k++) {
			String name = scan.nextLine();
			for (int l = 0; l < questions; l++) {
				String[] lines = scan.nextLine().split(" ");
				int q = Integer.parseInt(lines[0]);
				Participant p = new Participant(name, q-1, lines[1]);
				Question question = quiz.getQuestion(q-1);
				question.setOptionVotes(question.indexOf(lines[1]));
			}
		}

		for (int i = 0; i < questions; i++) {
			System.out.println("Highest number of votes for question : "+ quiz.getQuestion(i).getText()
			 + " : " + quiz.getQuestion(i).commonSelectedOption());
		}

	}
}
class Quiz{
     Question[] qu;
     int size;
     Quiz(){
        qu = new Question[10];
        size = 0;
     }
     public void addQuestion(Question q){
       qu[size++] = q;
     }
     public Question getQuestion(int n){
         return qu[n];
     }
}
class Question{
     String question;
	 String[] opts;
	 int[] count;
    Question(String ques,String[] options){
    	 question = ques;
    	 opts = options;
    	 count = new int[4];
    }
    public int indexOf(String s){
       for(int i=0; i<=4; i++){
       	 if(opts[i].equals(s)){
       	 	return i;
       	 }
       }
       return 0;
    }
    public String getText(){
    	return question;
    }
    public void setOptionVotes(int op){
        count[op]=count[op]+1;
    }
    public String commonSelectedOption(){
        int max = 0;
        int c = 0;
        for(int i=0; i<4; i++){
        	if(count[i]>max){
               max = count[i];
               c = i;
        	}
        }
        return opts[c];
    }
}
class Participant{
	String name;
	int questionNumber;
	String selectedOption;
	Participant(String n,int qNo, String opt){
          n=name;
          qNo=questionNumber;
          selectedOption=opt;
	}
}



