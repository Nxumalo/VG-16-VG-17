import java.util.*;

public class FindTheOutput{
  
    static Scanner console = new Scanner(System.in);

    public static void main (String [] args){
        
       int num;
       num = console.nextInt();
       while(num != -999){
            System.out.print(num % 25 + “ “);
            num = console.nextInt();
       }
       System.out.println();
    }
}
