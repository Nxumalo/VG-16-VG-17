// Sentinel - controlled while loop

import java.util.*;

public class SentinelControlWhileLoop{

  static Scanner console = new Scanner (System.in); 
 
  static final int SENTINEL = -999;

  public static void main (String [] args){
    
     int number;
     int sum = 0;
     int count = 0;

     System.out.println(“Line 1: Enter positive integers ending with “ + SENTINEL);

     number = console.nextInt();

     while(number != SENTINEL){
          
          sum = sum + number;
          count++;
          number = console.nextInt();
     }
    
     System.out.printf(“Line 7: The Sum of the %d number = %d%n”, count,sum);

     if(count != 0)
       System.out.printf(“Line 9: The Average = %d%n”,(sum / count));

     else
       System.out.println(“Line 11: No input.”);

  }
}
