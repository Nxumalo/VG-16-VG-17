// Program: StringBuffer Objects Parameters

public class StringBuffeeObjectsAsParameters{
  
  public static void main(String [] args){
    
    StringBuffer str = new StringBuffer("Hello");
    
    System.out.println("Line 2: str before calling the method stringParameter: " +str);
    stringParameter(str);
    System.out.println("Line 4: str after calling the method stringParameter: "+ str);
   
  } 
  public static void stringParameter(StringBuffer pStr){
     
    System.out.println("Line 5: In the method stringParameter");
    System.out.println("Line 6: pStr before changing its value: "+pStr);
    pStr.append(" There");
    System.out.println("Line 8: pStr after changing its value: "+pStr);
  }
}
