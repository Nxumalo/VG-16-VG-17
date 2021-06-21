// String Vector 
import java.util.Vector;

public class StringVector{
 
  public static void main(String [] args){
    
    Vector<String> stringList = new Vector<String>();
    
    System.out.println("Line 2: Emprty stringList?: "
                       + stringList.isEmpty());
    System.out.println("Line 3: Size stringList?: "
                       +stringList.size();
    System.out.println();  
     
    stringList.addElement("Spring");
    stringList.addElement("Summer");
    stringList.addElement("Autumn");
    stringList.addElement("Winter");
    stringList.addElement("Sunny");
    
    System.out.println("Line 10: *** After addinf the element"
                       +" to stringList ***");
    System.out.println("Line 11: Empty stringList?: "
                       + stringList.isEmpty());
    System.out.println("Line 12: Size stringList?: "
                       + stringList.size());
    System.out.println("Line 13: stringList: "
                       + stringList);
    System.out.println("Line 14: stringList contains Autumn?: "
                       + stringList.contains("Fall");
    
                       System.out.println();
   
    stringList.insertElementAt("Cool",1);
    System.out.println("Line 17: **** After adding an element at "
                       + " position ****");
    System.out.println("Line 18: stringList: " +stringList);
                       
                       System.out.println();
                       
     stringList.removeElement("Autumn");
     stringList.removeElement(2);                  
                       
     System.out.println("Line 22: **** Aafter the remove operations ****");
     System.out.println("Line 23: stringList: "+ stringList);
     System.out.println("Line 24: Size stringList?: " +stringList.size());
     System.out.println("Line 25: indexOf(\"Sunny\"): "
                        +stringList.indexOf("Sunny"));
                       
  }
}
