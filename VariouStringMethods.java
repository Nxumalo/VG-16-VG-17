//Program to illustrate the effect of various String Methods 

public class VariouStringMethods{

 public static void main(String [] args){

   String sentence;
   String str1;
   String str2;
   String str3;
   Int index;

   sentence = “Now is the time for the Matrix Revolution”;

   System.out.println(“Line 2: sentence = \ “” + sentence + “\””);
   System.out.println(“Line 3: The length of sentence = “ + sentence.length());
   System.out.println(“Line 4: The character at index 16 in “ + “sentence = “ + sentence.charAt(16));
   System.out.println(“Line 5: The index of the first t in “ + “sentence = “ + sentence.indexOf(‘t’));
   System.out.println(“Line 6: The index of for in sentence “ + “= “ + sentence.indexOf(“for”));
   System.out.println(“Line 7; sentence in uppercase = \”” + sentence.toUpperCase() + “\””);

   index = sentence.indexOf(“birthday”);
   str1 = sentence.substring(index,index + 14);
   System.out.println(“Line 10: str1 = \”” + str1 + “\””);

   str2 = “Super “ + str1;
   System.out.println(“Line 12: str2 = \”” + str2 + “\””);

   str3 = “sentence.replace(‘t’,’T’);
   System.out.println(“Line 14: str3 = \”” + str3 + “\””);
 }
}
