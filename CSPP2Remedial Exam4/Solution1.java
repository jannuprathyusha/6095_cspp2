import java.util.*;

public class Solution1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.nextLine());
		Game game = new Game(count);
		game.addPlayer(new Player(scan.nextLine()));
		int totalScore = 0;
		while (scan.hasNextLine()) {
			String lines[] = scan.nextLine().split(" got ");
			if (lines.length == 1) {
				if (game.indexOf(lines[0]) == 0) {
					game.addPlayer(new Player(lines[0]));
				}
			}  else if (lines.length == 2) {
				String player = lines[0];
				int index = game.indexOf(player);
				int score = Integer.parseInt(lines[1]);
				//Please complete the code to complete the game.
				int[] scores = new int[count];
				// for(int i=0; i<count; i++){
				// 	if(game.players[index].getName().equals(player)){
				// 		if(score != 1 && score != 6){
				// 	          totalScore = totalScore + score;
				//           }
				//           if(score == 1){
				//           	totalScore = 0;
				//           	break;
				//           }
				//           if(score == 6){
				//           	break;
				//           }
				// 	}
				// }
				game.setTotalScores(index,score,player);
			}

		}
		System.out.println(game.winner().getName());
	}
}
class Game{
	int numOfPlayers;
	Player[] players;
	int totalScore;
	int size;
	Game(int n){
       numOfPlayers = n;
       players = new Player[6];
       size = 0;
       totalScore = 0;
	}
   public int indexOf(String s){
        for(int i=0; i<size; i++){
        	if(players[i].getName().equals(s)){
        		return i;
        	}
        }
        return -1;
   }
   public void addPlayer(Player p){
      players[size++] = p;
   }
   public void setTotalScores(int index,int score,String s){
       for(int i=0; i<size; i++){
       	if(players[index].getName().equals(players[i].getName())){
       		if(score != 1 && score != 6){
       			totalScore = totalScore + score;
       		}
       		if(score == 1){
       			totalScore = 0;
       			break;
       		}
       		if(score == 6){
       			break;
       		}	
       	}
       }
   }
   // public int getTotalScore(){
   // 	return totalScore;
   // }
   public Player winner(){
   	int max = 0;
   	int ind = 0;
      for(int i=0; i<size; i++){
         if(max<players[i].totalScore){
         	max = players[i].totalScore;
         	ind = i;
         }
      }
      return players[ind];
}
}
class Player{
	String playerName;
	int score;
	Player(String name){
        playerName = name;
	}
	public String getName(){
		return playerName;
	}

}