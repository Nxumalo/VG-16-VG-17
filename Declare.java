import java.util.*;

public class Declare{
  
  static Scanner console = new Scanner(System.in);
  
  public static double larger(double x,double y){
    
    if(x >= y)
     return x;
    return y;
  }
  
  public static void main(String [] args){
    
    double one, two, maxNum;
    
    System.out.println("The larger of 5 and 6 is "+ larger(5,6));
    
    System.out.print("Enter two numbers: ");
    one = console.nextDouble();
    two = console.nextDouble();
    System.out.println();
    
    System.out.println("The larger of "+ one + " and " + two + " is " + larger(one,two));
    System.out.println("The larger of "+ one + " and 29 is " + larger(one,29));
    maxNum = larger(38.45,56.78);
    System.out.println("maxNum = " + maxNum);
                       
  }
  
}
