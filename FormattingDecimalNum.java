// Program to illustrate how to format the output of decimal numbers 

public class FormattingDecimalNum{
 public static void main(String [] args){

  double x = 15.674;
  double y = 235.73;
  double z = 9525.9864;
  
  System.out.println(“Line 4: Outputting the values of x, y and z with two decimal places.”);
  System.out.printf(“Line 5: x = %.2f %n”,x);
  System.out.printf(“Line 6: y = %.2f %n”,y);
  System.out.printf(“Line 7: z = %.2f %n”,z);

  System.out.printf(“Line 8: Outputting the value of x, y, and z with theee decimal places.”);
  System.out.printf(“Line 9: x = %.3f %n”,x);
  System.out.printf(“Line 10: y = %.3f %n”,y);
  System.out.printf”Line 11: z = %.3f %n”, z);
 }
}
