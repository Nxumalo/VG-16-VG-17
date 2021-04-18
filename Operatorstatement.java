public class Operatorstatement{
 public static void main(String[] args){
  String str;
  int num1, num2;

  num1 = 12;
  num2 = 26; 
  str = “The Sum = “ +num1 + num2;
  System.out.println(“Line 4: str: “ +str);

  str = “The Sum = “ +(num1 + num2);
  System.out.println(“Line 6: str: “ +str);

  str = num1 + num2+ “ is the Sum”;
  System.out.println(“Line 8: str: “ +str);

  str = “The Sum of “ + num1 + “ and “ + num2 + “ = “
        +(num1 + num2);
  System.out.println(“Line 10: str: “ +str); 
}
}
