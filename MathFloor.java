import static java.lang.Math.*;

public class MathFloor{

  public static void main (String [] args){
  
     int counter;
     
     for(counter = 1; counter <= 100; counter++)
        if(pow(floor(sqrr(counter)),2) == counter)
          System.out.println(counter + " ");
     System.out.println();             
  }

}
