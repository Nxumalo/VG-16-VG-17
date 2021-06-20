// Arrays as parameters to methods

import java.util.*;

public class ArraysAsParameters{
 
  static final int ARRAY_SIZE = 10;
  static Scanner console = new Scanner(System.in);
  
  public static void main(String [] args){
   
    int [] listA = new int [ARRAY_SIZE];
    int [] listB = new int [ARRAY_SIZE];
    
    System.out.print("Line 3: listA elements: ");
    
    // output the elements of the list A using printArray 
    printArray(listA,listA.length);
    System.out.println();
    
    System.out.print("Line 6: Enter " + listA.length +" integers: ");
    
    // input the data into listA using the method fill array    
    fillArray(listA, listA.length);
    System.out.println();
    
    System.out.print("Line 9: After filling listA, the elements are: \n");
    
    // output the elements of listA
    printArray(listA, listA.length);
    System.out.println();
    
    // find and output the sum of the elements of listA
    System.out.println("Line 12: The sum of the elements of lstA is: "
                       + sumArray(listA,listA.length));
    
    // find and output the position of the largest element in listA
    System.out.println("Line 13: The position of the largest element in listA is: "
                      + indexLargestElement(listA, listA.length)):
    
    // find and output the largest element in listA
    System.out.println("Line 14: The largest element in listA is: "
                       + listA[indexLargestElement(listA, listA.length0)]);
    
    // copy the element of listA into listB
    copyArray(listAa,listB,listA.length);
    System.out.print("Line 16: After copying the element of listA into listB,\n"
                     + "                listB elements are: ");
    
    // output the elements of listB
    printArray(listB,listB.length);
    System.out.println();
                      
  }
}
