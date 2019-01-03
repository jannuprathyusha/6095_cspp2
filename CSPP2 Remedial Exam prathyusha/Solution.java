import java.util.*;
class Hotel{
	int size;
	Reservation[] rooms;
	Hotel(){
		size = 0;
        rooms = new Reservation[5];
	}
	public int reserveRoom(String person){
		if(size == rooms.length){
        	System.out.println("All Rooms are reserved");
        }
        else{
		for(int i=0;i<rooms.length;i++){
			if(rooms[i] == null){
				rooms[i] = new Reservation(person,i+1);
				++size;
				return i+1;
			}
		}
		}
        return -1;
	}
	public boolean reserveRoom(String person,int roomNumber){
		//System.out.println(rooms.length);
		//System.out.println(size);
		if(rooms[roomNumber-1] == null){
			rooms[roomNumber-1] = new Reservation(person,roomNumber);
			++size;
			return true;
		}
		else if(size == rooms.length){
        	System.out.println("All Rooms are reserved");
        	return false;
        }
		else if(rooms[roomNumber-1] != null){
			System.out.println("Room is already reserved");
             return false;
		}
        return false;
	}
	public void printReservations(){
		for(int i=0;i<size;i++){
			if(rooms[i] != null){
				System.out.println(rooms[i]);
			}
		}
	}

	public void cancelReservations(String person){
		for(int i=0;i<rooms.length;i++){
			if(rooms[i] != null)
				if(rooms[i].getName().equals(person)){
                 rooms[i]=null;
                 --size;
			}
		}
	}

	public boolean buildRooms(int num){
		rooms = Arrays.copyOf(rooms, rooms.length + num);
		return true;
	}
}
/**
 * Class for main.
 */
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
