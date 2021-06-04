import java.util.*;

public class LogicOrder{
  
  static Scanner console = new Scanner(System.in);
  
  public static void main(String [] args){
    
   int num1, num2;
   System.out.println("Please enter two integers on seperate lines");
   num1 = console.nextInt();
   num2 = console.nextInt();
   func(num1,num2);
   System.out.println("The two integers are " + num1 + " , " + num2);
    
  }
  public static void func(int val1, int val2){
    
   int val3, val4;
    val3 = val1 + val2;
    val4 = val1 * val2;
    System.out.println("The sum and product are " + val3 + " and " + val4);
  }
  
  
}
