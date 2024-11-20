import java.util.*;
public class ShoppingClient {
   public static void main(String[] args){
    Scanner console = new Scanner(System.in);
    ShoppingList sl = new ShoppingList();
    
    /** I choose to use boolean as a data type for menu is becuase I want my program can 
    keep asking the user to pick a choice eveytime it has finsied the user's previous request,
    until the user press 5 **/
    
    boolean menu = true;
    while(menu){
    System.out.println("Press your choice from 1 to 5: ");
    System.out.println("1. Display the menu.");
    System.out.println("2. Add a shopping item.");
    System.out.println("3. Change the quantity of the item in the shopping list.");
    System.out.println("4. Display the shopping list.");
    System.out.println("5. Exist the program"); 
    int choices = console.nextInt();    
    if(!choices.equals(5)){
                  break;
                  }
    
    //The switch method can make the prgroam do different taks based on what choice the user entered.
    //For example, if the user enters 1, the menu will be displayed.
    switch(choices){
      case 1:
         {
          System.out.println("The Menu:");
          System.out.println("1. Add a shopping item.");
          System.out.println("2. Change the quantity of the item in the shopping list.");
          System.out.println("3. Display the shopping list.");
          System.out.println("4. Exist the program");  
         }
          break;
      
      case 2:
         {
           System.out.print("Enter the shopping item: ");
           String name = console.next();
           System.out.print("Enter the quantity: ");
           int quantity = console.nextInt();
           System.out.print("Enter the price: ");
           double price = console.nextDouble();
           //After I got the new useriput, I will need to save them into the array.
           //Therefore, I build a brige between ShoppingItem and ShoppingClient file by creating a new object called itemlist and store the new user inputs into it. 
           ShoppingItem itemlist = new ShoppingItem(name, quantity, price);
           
           //If the user want to add an item, then the new user inputs will be saved in the itemlist object.
           boolean addItem = sl.add(itemlist);
           if(addItem)
          {
           System.out.println("Your item has been successfully added to your shopping cart."); 
          }else{
           System.out.println("Your shopping cart is full!");
          }
        }
         break;
     
      case 3: 
         {
           System.out.println("Enter the item name you want to search: ");
           String itemName = console.next();
           /**Building a bridge between the shoppingItem and shoppingList file, 
           because I want to compare this new user input name to the name that
           has saved in the array list.**/
           ShoppingItem name = sl.searchByName(itemName);//This line passes the itemName to the searchByName method in the shoppingList file.
           if(name!=null)//the the return data is not null, then do the tasks inside the if loop.
          {
            System.out.println("Your item has been founed in your shopping cart!");
            System.out.println("Enter the new quantity of the item: ");
            int newQuantity = console.nextInt();
            name.setQuantity(newQuantity); //pass the new quantity to the setQauntity method in the Shopping item file for the item that has found in the array list. 
            System.out.println("The quantity of the item: "+itemName+"has been updated to: " + newQuantity);
          }            
        }
          break;
      
      case 4:
         {  
           System.out.println("The shopping list: ");
           System.out.println(sl.toString());//Print out the entire array list by call the toString method in the shoppingList file.
           System.out.println("The total cost is: " + sl.getTotalCost());//Print out the totalCost by call the getTotalCost method in the shoppingList file.
         }
         break;
      
      case 5:
         {
            System.out.println("Program exists.");
          }
          break;
        }

          

      }    
   }
}