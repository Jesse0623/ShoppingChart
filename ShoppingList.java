public class ShoppingList
{  
    private ShoppingItem [] items; //Array field to store 
    private int size; // the shopping items private int size;
   
    public ShoppingList() {
      items = new ShoppingItem[10];
      size = 0;
   }
   
    public boolean add (ShoppingItem newItem) {
   
       if (size>=10) return false;
       else{
          items[size]= newItem; //or items[size++] = newItem;
          size++;
          return true;
       }
 
   }
   
   public double getTotalCost (){
      double totalCost= 0;
      for(int i=0; i<size; i++){
        totalCost += items[i].getCost();
      }
      return totalCost;
    }
    
    /**
     If the array is empty, which means size = 0 (since we are using the "size"
     variable as an accumulator that saves all the items in it), then we give
     out a warning. If there are items in the array, we can first return the 
     part that doesn't need to be printed out one by one, then add them with 
     the rest of the data. We can get each item's quantity and names by using
     items[i].toStrinh() to call the tostring method in the shoppingItem file.  
    **/
    
    public String toString (){
      if(size==0){
        return "No items in your shopping list";
      }  else {
        String result = "ShoppingList has" + size + "shopping items";
        for(int i=0; i<size; i++){
         result += items[i].toString();
         if(i<size-1)
         {
          result += ","; 
         }
        }
         return result;
      }
    }
    
    public ShoppingItem searchByName (String itemName){
    
    for(int i=0;i<size;i++)
    { //compare the items name that has saved into the sarry to the user input
      if (items[i].getName().equals(itemName))
         { //if the name in the array equals to the user input, then return the name in the array;
            return items[i];
         }
      }
            return null;
    }
    
}