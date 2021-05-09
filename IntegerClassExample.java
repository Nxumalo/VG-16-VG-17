// Program: thats illustrates the autoboxing and unboxing of Integer objects.
public class IntegerClassExample{
  
  public ststic void main(String [] args){
    
    int x, y;
    Integer num1,num2;
    
    num1 = 8;
    num2 = 16;
    
    System.out.println("Line 5: num1 = "+ num1 +",num2 = "+num2);
    
    x = num1 + 4;
    
    System.out.println("Line 7: x = "+ x);
    
    y = num1 + num2;
    
    System.out.println("Line 9: y = " +y);
    
    System.out.println("Line 10: The value of 2 * num1 + num2 = "+ (2 * num1 + num2));
    System.out.println("Line 11: The value of x * num2 - num1 = "+ (x * num2 - num1));
    System.out.println("Line 12: The value of num1 <= num2 is "+ (num1 <= num2));
    System.out.println("Line 13: The value of 2 * num1 <= x is "+(2 * num1 <= x));
    System.out.println("Line 14: The value of 2 * num1 > num2 is "+ (2 * num1 >= num2));
  }
}  
