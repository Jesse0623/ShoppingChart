//Charlene Jarrell, CS&141, Winter 2023
//Assignment 21, 3/17/23
//
//This program is a class that pairs with the Building class and ResortManagement client program.

public class Room
{
   //fields
   private char building;        //building that the room belongs to, identified with a letter
   private int roomNumber;
   private boolean occupied;     //whether room is occupied or vacant
   private double cost;          //price of the room

   //constructors
   public Room(char building, int roomNum, double cost)
   {
      this.building = building;                 //"this" is used to specify we are referring to fields of the class, not local variable.
      this.roomNumber = roomNum;
      this.occupied = false;                    //false means the room is unoccupied
      this.cost = cost;
   }
   
   //accessors
   public String toString()                     //special accessor that allows the user to implicitly call the String of the object
   {
      String y = "";
      if(this.occupied==false)
         y = "empty";
      else
         y = "occupied";
      return "Room "+getRoomName()+" : is "+y+".";
   }
   
   public String getRoomName()
   {
      return ""+this.building+this.roomNumber;
   }
   
   public boolean getOccupied()
   {
      return this.occupied;
   }
   
   public double getCost()
   {
      return this.cost;
   }
   
   //mutators
   public void rentRoom()
   {
      this.occupied = true;
   }
   
   public void emptyRoom()
   {
      this.occupied = false;
   }
}