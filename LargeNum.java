// Program: Larger of the three numbers

import java.util.*;

public class LargeNum {
  
  static Scanner console = new Scanner(System.in);
  
  public static void main(String [] args){
    
    double num1, num2;
    
    System.out.println("The Line 2: The larger of 5.6 and 10.8 is " +larger(5.6,10.8));
    System.out.print("Line 3: Enter two numbers: ");
    num1 = console.nextDouble();
    num2 = console.nextDouble();
    System.out.println();
    
    System.out.println("Line 7; The larger of "+num1+" and "+num2+ " is "+ larger(num1,num2));
    System.out.println("Line 8: The largest of 23.5, 34,6, and 12 is " +compareThree(23.5, 34.6, 12));
  }
  
  public static double larger(double x,double y){
    
    if( x >= y)
      return x;
    else 
      return y;
  }
  
  public static double compareThree(double x, double y, double z){
    return larger(x, larger(y, z));
  }
}
