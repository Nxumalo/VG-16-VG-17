import java.util.*;

public class Mystery {
  
  static Scanner console = new Scanner (System.in);
  
  static final int NUM = 10;
  static final double x = 20.5;
  
  public static void main(String [] arg){
    
    int a, b;
    double z;
    char grade; 
    a = 25;
    
    System.out.println("a = " +a);
    System.out.print("Enter the first integers: ");
    System.out.flush();
    a = console.nextInt();
    System.out.println();
    System.out.print("Enter the second integers: ");
    System.out.flush();
    b = console.nextInt();
    System.out.println();
    System.out.println("The numbers you entered are " +a+ " and " +b);
    
    z = X + 2 * a - b;
    
    System.out.println(" z = " +z);
    grade = 'A';
    System.out.println("Your grade is " +grade);
    
    a = 2*NUM + (int)z;
    System.out.println("The value of a = "+ a);
  }
}
