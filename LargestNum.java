// Largest of set of numbers
import java.util.*;

public class LargestNumber{

  public static void main(String [] args){
  
    double [] numberList = { 23,45.5,89,35,92.89,63,90,120.90,79,23,90,89};
    
    System.out.println("Line 2: The larger of 5.6 abd 10.8 is "
                      + largest(5.6, 10.8));
                      
    System.out.println("Line 3: The largest of 23, 78, and 56 is "
                      + largest(23, 78, 56));
                      
    System.out.println("Line 4: The largest of 93, 28, 83, and 66 "
                      + largest(93, 28, 83, 66));
                      
    System.out.println("Line 5: The largest of 22.5, 12.34, 56.34, 78, "
                      + "\n         " + 98.45, 25, 78, 23 and 36 is "
                      + largest(22.5, 12.34, 56.34, 78, 98.45, 25, 78, 23, 36));
                      
    System.out.println("Line 6: The largest number in numList is "
                      + largest(numberList));
                      
    System.out.println("Line 7: A call to the method largest with and empty \n"
                      + "        parameter list returns the value "
                      + largest());
                      
    public static double largest( double ... numList){  
    
      double max;
      int index;
      
      if(numList.length != 0){
       
        max = numList[0];
        
        for(index = 1; index < numList.length; index++){
         
          if(max < numList [index])
            max = numList [index];
        }
        
        return max;
       
      }
        return 0.0;
    }

}
