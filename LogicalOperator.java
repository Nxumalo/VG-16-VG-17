// Logical Operators 

public class LogicalOperator{

 public static void main(String [] args){ 
    
   boolean found = true;
   boolean flag = false;
   double x = 5.2;
   double y = 3.4;
   int a = 5, b = 8;
   int n = 20;
   char ch = ‘B’;

   System.out.println(“Line 1: !found evaluates to “ +!found);
   System.out.println(“Line 2: x > 4.0 evaluates to “ + (x>4.0));
   System.out.println(“Line 3: !found && (x >= 0) evaluates to “ + (!found && (x >= 0)));
   System.out.println(“Line 4: !(found && (x >= 0)) evaluates to “ + !(found && (x >= 0)));
   System.out.println(“Line 5: x + y <= 20.5 evaluates to “+ (x + y <= 20.5));
   System.out.println(“Line 6: (n >= 0) && (n <= 100) evaluates to “+ ((n >= 0) && (n <= 100)));
   System.out.println(“Line 7: (‘A’ <= ch && ch <= ‘Z’) evaluates to “+ (‘A’  <= ch && ch <= ‘Z’));
   System.out.println(“Line 8: (a + 2 <= b) && !flag evaluates to” +((a + 2 <= b) && !flag));
 }
}
