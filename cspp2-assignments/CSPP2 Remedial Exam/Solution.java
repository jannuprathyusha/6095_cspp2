import java.util.*;
/**
 * Class for main.
 */
class Hotel{
	Reservation[] rooms;
	 int size; 
	Hotel(){
		rooms = new Reservation[5];
		size = 0;
	}
	public int reserveRoom(String person) {
	 	for(int i = 0; i < rooms.length; i++) {
	 		if(rooms[i] == null) {
	 			Reservation r = new Reservation(person, i+1);
	 			rooms[i] = r;
	 			size++;
	 			return i+1;
	 		}
	 	}
	 	return -1;
	 } 
	public boolean reserveRoom(String person, int roomNum) {
	 	if(rooms[roomNum-1] != null) {
	 		return false;
	 	} else if(size == rooms.length){
	 		System.out.println("All Rooms are reserved");
	 		return false;
	 	} else {
	 		Reservation r = new Reservation(person, roomNum);
	 		rooms[roomNum-1] = r;
	 		return true;
	 	}
	 }
	void printReservations() {
	  	for(int i = 0; i < rooms.length; i++) {
	  		if(rooms[i] != null) {
	  			System.out.println(rooms[i].getName() + " " + rooms[i].getRoom());
	  		}
	  	}
	 }
	 public void cancelReservations(String person) {
	 	return;
	 }
	 public boolean buildRooms(int num) {
	 	return false;
	 }
}
public class Solution{

  public static void main(String[] args){
  		Hotel h = new Hotel();
		String name;
		int roomnum;
  		Scanner scan = new Scanner(System.in);
		int readLines = Integer.parseInt(scan.nextLine());
		int c=0;
		while (c<readLines) {
			String line = scan.nextLine();
			String tokens[]=line.split(" ");
				switch(tokens[0])
				{
					case "reserve":
									name = tokens[1];
									roomnum = -1;
								    //if we got a good name, try to reserve a room
								    if(!((name==null) || (name.equals(""))))
								        roomnum = h.reserveRoom(name);

								    //give feedback
								    if(roomnum!=-1)
								        System.out.println(name+" "+roomnum);
								 
									break;

					case "reserveN":
									name = tokens[1];
									//if we got a bad input, report failure

								    if((name==null) || (name.equals("")))
								        roomnum = -1;
								    else{
								     roomnum = Integer.parseInt(tokens[2]);
								    }    
								    //give feedback
								    if(h.reserveRoom(name, roomnum))
								        System.out.println(name+" "+roomnum);
								    
								    break;

					case "print":
								//print all the reservations done in the hotel
								h.printReservations();
								 break;
					case "cancel":
								//cancel the rooms for that particular person
								name = tokens[1];
								if(!((name==null) || (name.equals("")))){
								        h.cancelReservations(name);
								        System.out.println(name+" now has no reservations.");
								    }else{
								        System.out.println("No input");
   								 }
   								 break;
					case "build":
								//add more number of rooms to the existing rooms
								roomnum = Integer.parseInt(tokens[1]);
								
							    if(h.buildRooms(roomnum))
							        System.out.println("Added "+roomnum+" more rooms");
							    else
							        System.out.println("No rooms are added");
							      break;
				}
				c++;
		}
	}
}
