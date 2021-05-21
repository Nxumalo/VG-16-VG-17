// Program: Comparison of Class Averages

import java.util.*;
import java.io.*;

public class DataComparison{

   public static void main(String [] args) throws FileNotFoundException{
   
      //Step 1
      
      String courseId1;
      String courseId2;
      int numberOfCourses;
      DoubleClass avg1 = new DoubleClass();   // average for a course group 1
      
      DoubleClass avg2 = new DoubleClass();   // average for a course group 2
      
      double avgGroup1;
      double avgGroup2;
      
      //Open the input and output files
      Scanner group1 = new Scanner(new FileReader("a:\\group1.txt"));
      Scanner group2 = new Scanner(new FileReader("a:\\group2.txt"));
      
      PrintWriter outfile = new PrintWriter("a:\\student.out");
      
      avgGroup1 = 0.0;
      avgGroup2 = 0.0;
      
      numberOfCourses = 0;
      
      outfile.println("Course ID Group No      Course Average");
      
      while(group1.hasNext() && group2.hasNext()){
            
         courseId1 = group1.next();
         courseId2 = group2.next();
         
         if(!courseId1.equals(courseId2)){
            System.out.println("DATA ERROR: CourseIDs do not match.");
            System.out.println("Program Terminates.");
            outfile.println("DATA ERROR: CourseIDs do not match.");
            outfile.println("Program terminates.");
            outfile.close();
            return;
            
         }
         else
         {
               calculateAverage(group1, avg1);
               calculareAverage(group2, avg2);
               printResult(outfile, courseId1, 1, avg1);
               printResult(outfile, courseId2, 2, avg2);
               avgGroup1 = avgGroup1 + avg1.getNum();
               avgGroup2 = avgGroup2 + avg2.getNum();
               outfile.println();
               numberOfCourses++;
         }
            
      }// end while loop
      
      if (group1.hasNext() && group2.hasNext())
         System.out.println("Ran out of data for group 2 before group 1.");
      else
         if(!group1.hasNext() && group2.hasNext())
           System.out.println("Ran out of data for group 1 before group2.");
           
         else{
            outfile.printf("Avg for group 1: %.2f %n",(avgGroup1 / numberOfCourses));
            outfile.printf("Avg for group 2: %.2f %n",(avgGroup2 / numberOfCourses));
         }
         
         group1.close();
         group2.close();
         outfile.close();
    }
    public static void calculateAverage(Scanner inp,
                                  DoubleClass courseAvg){
    
       double totalScore = 0.0;
       int numberOfStudents = 0;
       int score = 0;
       
       score = inp.nextInt();
       
       while(score != -999){
       
           totalScore = totalScore + score;
           numberOfStudents++;
           score  = inp.nextInt();
       }
       courseAvg.setNum(totalScore / numberOfStudents);
       // end of calculate average
     }
       
    public static void printResult(PrintWriter outp, 
                  String courseId,int groupNo, DoubleClass avg){
        
       if(groupNo == 1)
          outp.print("  "+ courseId + "  ");
       else
          outp.print("           ");
        
       outp.println("%9d %15.2f%n", groupNo, avg.getNum());
       
       }
    }
    
    
