import java.util.*;

public class NestedControlStructure{

   static Scanner console = new Scanner(System.in);

   public static void main (String [] args){

      String studentId;
      int    testScore;
      int    count = 0;

      System.out.print(“Enter the student ID (Enter ZZZ to end):”);
      System.out.flush();
      studentId = console.next();
      System.out.println();

      while(!studentId.equals(“ZZZ”)){
     
           count++;
           System.out.print(“Enter the test score: “);
           System.out.flush();
           testScore = console.nextInt();
           System.out.println();

           System.out.print(“Student Id = “+studentId+”, test score = “
                            + testScore + “, and grade = “);
 
           if(testScore >= 90)
              System.out.println(“A.”);
           else if (testScore >= 80)
              System.out.println(“B.”);
           else if (testScore >= 70)
              System.out.println(“C.”);
           else if (testScore >= 60)
              System.out.println(“D.”);
           else 
              System.out.println(“F.”);

           System.out.print(“Enter the student ID (Enter ZZZ to end): “);

           System.out.flush();
           studentId = console.next();
           System.out.println();
      } // end while 
    System.out.println(“\nStudents in class = “+ count);
 }
}

       
