//*************************************************************************************
// Program: Sum the first n positive integers
// This program finds the sum of the first n positive integers. 
//*************************************************************************************

import java.util.*;

public class SumNumbers{ 

   static Scanner console = new Scanner(System.in);

   public static void main (String [] args){
     
      int counter;
      int sum;
      int n;

      System.out.println(“Line 1: Enter the number of positive integers to be added: “);
      System.out.flush();
      n = console.nextInt();
      System.out.println();
   
      sum = 0;

      for(counter = 1; counter <= n; counter++)
          sum = sum + counter;
      System.out.println(“Line 8: The sum of the first “+n+” positive integers is “ +sum);
  }
}
