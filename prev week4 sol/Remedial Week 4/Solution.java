import java.util.*;

public class Solution {
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
				while(scan.hasNext()){
					if(game.players[index].getName().equals(player) && game.players[index] != null){
						if(index >= 0){
						if(score != 1 && score != 6){
					          game.players[index].totalScore = game.players[index].totalScore + score;
				          }
				          if(score == 1){
				          	game.players[index].totalScore = 0;
				          	break;
				          }
				          if(score == 6){
				          	game.players[index].totalScore = game.players[index].totalScore + 6;
				          	break;
				          }
				      }
					}
				}
				break;
			}

		}
		System.out.println(game.winner().getName());
	}
}
class Game{
	int numOfPlayers;
	Player[] players;
	int size;
	Game(int n){
       numOfPlayers = n;
       players = new Player[5];
       size = 0;
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
      players[size] = p;
      ++size;
   }
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
	int totalScore;
	Player(String name){
        playerName = name;
	}
	public String getName(){
		return playerName;
	}

}