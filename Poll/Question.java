import java.util.Scanner;
import java.util.Arrays;
class Question{
	String question;
	String[] options;
	int[] count; 
	Question(){
       options = new String[4];
       count = new int[4];
    }
    Question(String question,String[] options) {
      this.question = question;
      this.options = options;
    }
    public String getText() {
        return question;
   }
    
   
    public int indexOf(String str){
      for(int i=0; i<4;i++){
        if(options[i].equals(str)){
          return i;
        }
      }
      return 0;
    }
    public void setOptionVotes(int n){
        count[n] = count[n] + 1;
    }
    public String commonSelectedOption(){
        int max = 0;
        int index = 0;
        for(int i=0; i<options.length;i++){
           if(count[i]>max){
            max = count[i];
            index=i;
           }
        }
        return options[index];
    }
   }
