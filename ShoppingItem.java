public class ShoppingItem {
   private String name; // Name of the shopping item private int quantity; 
   private int quantity;//quantity private double price; 
   private double price;//price per unit.

   public ShoppingItem (String name, int quantity, double pricePerUnit){
      this.name= name;   
      this.quantity = quantity;
      this.price = pricePerUnit;
   } 
    
   //returns the name of this item
   public String getName() {
      return name;
   }
   
   public double getCost() {
      return quantity*price;
   }
   
   
   public void setQuantity(int quantity) {
      this.quantity=quantity;
   }
   
   
   public String toString () {
      return quantity + " " + name;
   }
   
}


