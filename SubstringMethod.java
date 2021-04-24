//The Substring function 

public class SubstringMethod{

 public static void main (String [] args){
    String sentence;
    String str1;
    String str2;

    sentence = “It is cloudy and warm.”);

    System.out.println(“Line 2: “+ sentence.substring(0,5));
    System.out.println(“Line 3: “+ sentence.substring(6,12));
    System.out.println(“Line 4: “+ sentence.substring(6,22));
    System.out.println(“Line 5: “+ sentence.substring(3,9));
    
    str1 = sentence.substring(0,8);
    System.out.println(“Line 7: str1 = \“” + str1 + “\””));

    str2 = sentence.substring(2,12);
    System.out.println(“Line 9: str2 = \”” + str2 + “\””);
 }
}
