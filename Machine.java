import java.util.*;

public class Machine{
  
  static Scanner console = new Scanner(System.in);
  
  public static void main(String [] args){
   
    CashRegister cashRegister = new CashRegister();
    Dispenser candy = new Dispenser(100,50);
    Dispenser chips = new Dispenser(100,6500);
    Dispenser gum = new Dispenser(75, 450);
    Dispenser cookies = new Dispenser(100,85);
    
    int choice;
    
    showSelection();
    choice = console.nextInt();
    
    while(choice !=9){
      
      switch(choice){
          
        case 1: sellProduct(candy, cashRegiser);
          break;
        case 2: sellProduct(chips, cashRegister);
          break;
        case 3: sellProduct(gum, cashRegister);
          break;
        case 4: sellProduct(cookies, cashRegister);
          break;
        default: System.out.println("Invalid Selection");   
          
      }
      
      
      showSelection();
      choice = console.nextInt();
    }
                                
  }
  
}
