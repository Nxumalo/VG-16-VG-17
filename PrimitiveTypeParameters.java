// Program illustrating how a formal parameters of a primitive data type works.

public class PrimitiveTypeParameters{
  
  public static void main(String [] args){
    
    int number = 6;
    
    System.out.println("Line 2: Before calling the method funcPrimFormqlParam, number = " + number);
    
    funcPrimFormalParam(number);
    
    System.out.println("Line 4: After calling the method funcPrimFormalParam, number = " + number);
    
  }
  
  public static void funcPrimFormalParam(int num){
    
    System.out.println("Line 5: In method funcPrimFormalParam, before changing, num = " + num);
    
    num = 15;
    
    System.out.println("Line 7: In the method funcPrimFormalParam, after changing, num = " + num);
  }
}
