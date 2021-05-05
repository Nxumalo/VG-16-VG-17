// Flag - Controlled While Loop 
// Guessing the number game. 

import java.util.*;
public class FlagControloop{
   
   static Scanner  console = new Scanner (System.in);

   public static void main (String [] args){

     // declare the variables 

     int num;         // variables to store the random number
     int guess;       // variables to store the number guessed by the user
     boolean done;    // Boolean variables to control the loop

     num = (int) (Math.random() *  100);

     done = false;
 
     while(!done){
          System.out.print(“Enter an integer greater than or equal to 0 and less than 100: “);
          guess = console.next();
          System.out.println();

          if (guess == num){
             System.out.println(“You guess the correct number.”);
             done = true;
          }
          else 
             if(guess < num)
                System.out.println(“Your guess is lower than the number .\n Guess again!”);
             else
                System.out.println(“Your guess is higher than the number .\n Guess again!”);
    } // end while loop 
   }
  }
   



