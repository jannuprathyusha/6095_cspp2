class SeatAsgn {
  int row;
  String seat;
  
  SeatAsgn (int r, String s) {
    this.row = r;
    this.seat = s;
  }
  public int getRow(){
    return this.row;
  }
  public String getSeat(){
    return this.seat;
  
}
}
class AirlineTicket {
  String fromCity;
  String toCity;
  int flightNum;
  
  AirlineTicket (String fromCity, String toCity, 
                 int flightNum) {
    this.fromCity = fromCity;
    this.toCity = toCity;
    this.flightNum = flightNum;
  }

    public static void main(String[] args) {
      SeatAsgn s = new SeatAsgn(1,"al");
      System.out.println(s.getRow());
      System.out.println(s.getSeat());
    
  }
}
