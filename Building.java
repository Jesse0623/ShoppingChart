//Charlene Jarrell, CS&141, Winter 2023
//Assignment 21, 3/17/23
//
//This program is a class that pairs with the Room class and ResortManagement client program.

public class Building
{
   //fields
   private Room[] List;             //declare a Room array variable to store an array of references to Room objects
   private char buildingLetter;     //identifier of each building
   private int size;                //number of rooms in the building

   //constructors
   public Building(char bLetter, int size, double cost)  //constructor
   {
      this.size = size;
      this.buildingLetter = bLetter;
      this.List = new Room[size];     //construct the array with specified size that will store references to Room objects
      for (int i=0; i<size; i++)
      {
         this.List[i] = new Room(bLetter, (i+1), cost);  //fill array with references to newly constructed Room objects
      }
   }
   
   //accessors
   public String toString()
   {
      int countEmpty=0;
      for (int i=0; i<this.size; i++)
      {
         if(List[i].getOccupied()==false)
            countEmpty++;
      }
      return "Building "+this.buildingLetter+" has "+this.size+" rooms :  ("+countEmpty+") empty.";
   }
   
   public void printCurrentStatus()
   {
      System.out.println("Building "+this.buildingLetter);
      for(int i=0; i<this.size; i++)
      {
         System.out.println("   "+List[i]);                 //".toString()" not required to be explicitly stated when printing object
      }
   }
   
   public double getValue()
   {
      double value=0;
      for (int i=0; i<this.size; i++)
      {
         if(List[i].getOccupied()==true)
            value = value + List[i].getCost();
      }
      return value;
   }
   
   public String listOfEmpty()
   {
      String emptyList = "";
      for (int i=0; i<this.size; i++)
      {
         if(List[i].getOccupied()==false)
            emptyList = emptyList + List[i].getRoomName()+" ";
      }
      return emptyList;   
   }
   
   public String listOfNonEmpty()
   {
      String nonEmptyList = "";
      for (int i=0; i<this.size; i++)
      {
         if(List[i].getOccupied()==true)
            nonEmptyList = nonEmptyList + List[i].getRoomName()+" ";
      }
      return nonEmptyList;   
   }
   
   public int currentEmpty()
   {
      int sumOfEmpty=0;
      for (int i=0; i<this.size; i++)
      {
         if(List[i].getOccupied()==false)
            sumOfEmpty++;
      }
      return sumOfEmpty;
   }
   
   //mutators
   public String rentRoom()
   {
      for (int i=0; i<this.size; i++)
      {
         if (List[i].getOccupied()==false)
         {
            List[i].rentRoom();
            return List[i].getRoomName();
         }
      }
      return "error";
   }
   
   public boolean checkOut(String x)
   {
      for (int i=0; i<this.size; i++)
      {
         if (x.equals(List[i].getRoomName()));
         {
            List[i].emptyRoom();
            return true;
         }
      }
      return false;
   }
}