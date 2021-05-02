// The String Method CompareTo

public class StringComparison {

 public static void main (String [] args){

   String str1 = “Hello”;
   String str2 = “Hi”;
   String str3 = “Air”;
   String str4 = “Bill”;
   String str5 = “Bigger”;
   
   System.out.println(“Line 6: str1.compareTo(str2) evaluates to “ + str1.compareTo(str2));
   System.out.println(“Line 7: str1.compareTo(\”Hen\”) evaluates to “ + str1.compareTo(“Hen”));
   System.out.println(“Line 8: str4.compareTo(str3) evaluates to “ + str4.compareTo(str3));
   System.out.println(“Line 9: str1.compareTo(\”hello”\) evaluates to “ + str1.compareTo(“hello”));
   System.out.println(“Line 10: str2.compareTo(\”Hi\”) evaluates to “ + str2.compareTo(“Hi”));
   System.out.println(“Line 11: str4.compareTo(\”Billy\”) evaluates to “ + str4.compareTo(“Billy”));
   System.out.println(“Line 12: str5.compareTo(\”Big\”) evaluates to “ + str5.compareTo(“Big”));
 }
}
