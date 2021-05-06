import java.util.*;
public class Strange0{
    
   static Scanner console = new Scanner(System.in);

   public static void main (String []  args){
      int total = 0;
          number;
      do{
          number = console.next();
          total = total + number;
      }
      while (number != -1)
            System.out.println(“The sum of the numbers entered is: “ + total);
   }
}
