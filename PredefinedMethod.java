//How to use predifined methods

import static java.util.*;
import static java.lang.Character.*;

public class PredifinedMethods{
  
  public static void main(String [] args){
    
    int x;
    double u,v;
    
    System.out.println("Line 1: Uppercase a is " + toUppercase('a'));
    u = 4.2;
    v = 3.0;
    System.out.println("Line 4: %.1f to the power of %.1f = %.2f%n",u,v,pow(u,v));
    System.out.printf("Line 5: 5 to the power of 4 = "+ "%.2f%n",pow(5,4));
    
    u = u + Math.pow(3,3);
    System.out.printf("Line 7: u = %.2f%n",u);
    
    x = -15;
    System.out.printf("Line 9: The absolute value of %d = %d%n",x,abs(x));
  }
}
                       
                       
                       
                  
