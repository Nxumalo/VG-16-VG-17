//*****************************************************************************************************************
// Program: Classifying Numbers 
// This program counts the number of odd and even numbers.
// The program also counts the numbers of zeros
//*****************************************************************************************************************

import java.util.*;

public class ClassifyNumbers{

  static Scanner console = new Scanner(System.in);

  static final int N = 20;

  public static void main (String [] args){
    
    // Declare the variables 

    int counter;        // loop controls variables 
    int number;         // variables 

    int zeros = 0;
    int odds = 0;
    int evens = 0;

    System.out.println(“Please enter “ + N + “ integer, positive, negative, or zeros.”);

    for(counter = 1; counter <= N; counter++){
    
       number = console.nextInt();
       System.out.print(number + “ “);

       switch(numbers % 2){
       case 0: evens++;
               if (numbers == 0)
                  zeros++;
               break;
       case 1:
       case -1: odds ++;
  } // end switch 
 } //end for loop 

System.out.println();

System.out.println(“There are “ + evens + “ evens, which also includes “ + zeros + “ zeros “);
System.out.println(“Total numbers of odds is: “ + odds);
 }
}
