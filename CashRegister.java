public class CashRegister{
 
  private int cashOnHand;              // Variable stores cash in register
  
  // Default constructor to set the cash in
  
  public CashRegister(){
  
    cashOnHand = 500;
    
  }
  // Constructor with parameter to set the cash
  
  public CashRegister(int cashIn){
   
    if(cashIn >= 0)
      cashOnHand = cashIn;
    else
      cashOnHand = 500;
  }
  
  // Method to show the current amount in the cash register
  
  public int currentBalance(){
   
    return cashOnHand;
    
  }
  
  public void acceptAmount(int amountIn){
   
    cashOnHand = cashOnHand + amountIn;
  }
}
