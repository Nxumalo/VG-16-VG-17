// Program: Largest Number

import java.util.*;

public class LargestNumber{
  
  static Scanner console = new Scanner(System.in);
  
  public static void main(String [] args){
    
    double num;
    double max;
    int count;
    
    System.out.println("Enter 10 numbers: ");
    
    num = console.nextDouble();
    max = num;
    
    for(count = 1; count < 10; count++){
      
      num = console.nextDouble();
      max = larger(max,num);
    }
    System.out.println("The largest number is " + max);
  }
  public static double larger(double x, double y){
    
    if( x >= y)
      return x;
    else
      return y;
    
  }
}
