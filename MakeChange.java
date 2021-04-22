//*************************************************************************
//Program Make Change: Given any amount of change
//expressed in cents, this program computes the number
//of half-dollars,quarters,dimes,nickels,and
//pennies to be returned, returning as many 
//half-dollars as possible, then quarters,dimes,
//nickels, and pennies, in that order.
//*************************************************************************

import java.util.*;
public class MakeChange{
  
  static Scanner console = new Scanner(System.in);
  
  static final int HALFDOLLAR = 50;
  static final int QUARTER = 25;
  static final int DIME = 10;
  static final int NICKEL = 5;
  
  public static void main(String [] args){
    
    // declare variables 
    int change;
    // Statements: Step 1 - Step 12
    
    System.out.print("Enter the change in cents: ");
    System.out.flush();
    
    change = console.nextInt();
    System.out.pprintln();
    System.out.println("The Change you entered is " +change);
    
    System.out.println("The number of half dollars to be returned is "+ change/QUARTER);
    
    change = change % HALFDOLLAR;
    
    System.out.println("The number of dimes to be returned is "+ change/DIME);
    
    change = change % DIME;
    
    System.out.println("The number of Nickels to be returned is " +change/NICKEL);
    
    System.out.println("The number of pennies to be returned is " +change);
  }
}
                       
