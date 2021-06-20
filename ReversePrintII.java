// Read five numbers, find their sum, and print the numbers in reverse

import java.util.*;

public class ReversePrintII{
 
  static Scanner console = new Scanner(System.in);
  
  public static void main(String [] args){
   
    int [] items = new int[5];  // create an array of size 5
    
    int sum;
    int counter;
    
    System.out.println("Enterr five integers: ");
    
    sum = 0;
    
    for(counter = 0; counter < items.length; counter++){
    
      items[counter] = console.nextInt();
      sum = sum+ items[counter];
      
    }
    
    System.out.println("The sum of the numbers is: " + sum);
    
    System.out.print(" The numbers in reverse order are: ");
    
    // print the numbers in reverse order
    for(counter = items.length - 1; counter >= 0; counter--)
      System.out.print(items[counter] + " ");
    System.out.println();
  }
  
}
