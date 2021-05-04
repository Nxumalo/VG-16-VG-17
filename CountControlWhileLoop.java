// Counter controller while loop

import java.util.*;

public class CountControlWhileLoop{

  static Scanner console = new Scanner(System.in);

  public static void main (String [] args){ 

    int limit ;

    int number;
    int sum;
    int counter;

    System.out.println(“Line 1: Enter the data for processing. “);

    limit = console.nextInt();

    sum = 0;
    counter = 0;

    while(counter < limit){
         number = console.nextInt();
         sum = sum + number;
         counter++;
    }
    
    System.out.printf(“Line 9: The Sum of the %d Numbers = %d%n”, limit,sum);
   
    if(counter != 0)
       System.out.printf(“Line 11: The average = %d%n”,(sum/ counter));

    else
       System.out.println(“Line 13: No input.”);
 }
}
