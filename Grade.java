// Program: Compute the Grade
// This program reads a course score and prints the associated course grade.

import java.util.*;

public class Grade {
  
  static Scanner console = new Scanner(System.in);
  
  public static void main(String [] args){
    
    DoubleClass courseScore = new DoubleClass();
    
    System.out.println("Line 1: Based on the course score, this program computes the course grade.");
    
    getScore(courseScore);
    printGrade(courseScore.getNum());
  }
  
  public static void getScore(DoubleClass score){
    
    double s;
    
    System.out.print("Line 5: Enter the course score: ");
    
    s = console.nextDouble();
    System.out.println();
    
    score.setNum(s);
    
    System.out.println("Line 9: The course score is "+ s);
  }
  
  public static void printGrade(double testScore){
    
    System.out.print("Line 10: Your grade for the course is ");
    
    if(testScore >= 90)
      System.out.println("A");
    else if(testScore >= 80)
      System.out.println("B");
    else if(testScore >= 70)
      System.out.println("C");
    else if(testScore >= 60)
      System.out.println("D");
    else 
      System.out.println("F");
    
  }
  
}
