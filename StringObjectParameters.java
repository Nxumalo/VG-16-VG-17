// Program: String Object as Parameters

public class StringObjectParameters{
  
  public static void main(String [] args){
    
    String str = "Hello";
    
    System.out.println("Line 2: str before calling the method stringParameter: " +str);
    stringParameter(str);
    System.out.println("Line 4: str after calling the method stringParameter: "+str);
    
  }
  
  public static void stringParameter(String pStr){
    
    System.out.println("Line 5: In the method stringParameter");
    System.out.println("Line 6: pStr before changing its value: "+pStr);
    pStr = "It's a sunny day in Cape Town");
    System.out.println("Line 8: pStr after changing its value: "+pStr);
  }
  
}
