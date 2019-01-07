import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

class Participant {
	String name;
	String ans;
	int question;
	Participant(String n, int q, String a) {
		name = n;
		question = q;
		ans = a;
	}

}
class Question {
	String ques;
	String[] options;
	// HashMap<Integer, Integer> votes = new HashMap<Integer, Integer>();
	int[] count;
	Question(String q, String[] o) {
		ques = q;
		options = o;
		// for(int i = 0; i < 4; i++) {
		// 	votes.put(i, 0);
		// }
		count = new int[4];
	}
	int indexOf(String o) {
		for(int i = 0; i < 4; i++) {
			if(options[i].equals(o)) {
				return i;
			}
		}
		return 0;
	}
	String getText() {
		return ques;
	}
	void setOptionVotes(int opted) {
		// votes.put(opted, ((votes.get(opted)) + 1));
		count[opted] = count[opted] + 1;
	}
	String commonSelectedOption() {
		int max = 0;
		int key = 0;
		// for(Integer each: votes.keySet()) {
		// 	if(votes.get(each) > max) {
		// 		max = votes.get(each);
		// 		key = each;
		// 	}
		// }
		for(int i = 0; i < 4; i++) {
			if(count[i] > max) {
				max= count[i];
				key = i;
			}
		}
		return options[key];
	}

} 
class Quiz {
	Question[] list;
	int size;
	Quiz() {
		list = new Question[10];
		size = 0;
	}
	void addQuestion(Question q) {
		list[size++] = q;
	}
	Question getQuestion(int q) {
		return list[q];
	}

}
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



