// Class Dispenser

public class Dispenser{
 
  private int numberOfItems; // store number of items in dispensor
  private int cost;          // store the cost of an item
  
  // Default Constructor to set Cost and Number
  
  public Dispenser(){
   
    numberOfItems = 50;
    cost = 50;
    
  }
  
  // Constructor with Parameter to set the cost and number of items
  
  public Dispenser(int setNoOfItems, int setCost){
   
    if(setNoOfItems >= 0)
      numberOfItems = setNoOfItems;
    else
      numberOfItems = 50;
    
    if(setCost >= 0)
      cost = setCost;
    else
      cost = 50; 
    
  }
  
  // Method to show the number of items in the machine
  
  public int getCount(){
   
    return numberOfItems;
    
  }
  // Method to show the cost of an item
  
  public int getProductCost(){
   
    return cost;
    
  }
  
  // Method to reproduce the number of items by 1
  
  public void makeSale(){
   
    numberOfItems--;
    
  }
  
}
