// Program: Print a triangle of stars

import java.util.*;

public class TriangleStars{
  
  static Scanner console = new Scanner(System.in);
  
  public static void main(String [] args){
     
    int numberOfLines;
    int counter;
    int numberOfBlanks;
    
    System.out.print("Enter the number of stars lines ( 1 to 20) to be printed: ");
    numberOfLines = console.nextInt();
    System.out.println();
    
    while(numberOfLines < 0 || numberOfLines > 20){
      
      System.out.println("The number of star lines should be between 1 and 20");
      System.out.print("Enter the number of star lines (1 to 20) to be printed: ");
      numberOfLines = console.nextLines();
      System.out.println();
    }
    
    numberOfBlanks = 30;
    
    for(counter = 1; counter <= numberOfLines; counter ++){
      
      printStars(numberOfBlanks, counter);
      numberOfBlanks--;
      
    }
  }
  
  public static void printStars(int blanks, int starsInLine){
    
    int count;
    
    for(count = 1; count <= blanks; count++)
      System.out.print(" ");
    for(count = 1; count <= starsInLine; count++)
      System.out.print(" ");
    System.out.println();
  }
}
