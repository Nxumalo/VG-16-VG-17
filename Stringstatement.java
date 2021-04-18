import java.util.*;
public class Stringstatement{
 static Scanner console = new Scanner(System.in);
 public static void main((String[] args){
 
   String firstName;
   String lastName;
   int age;
   double Weight;
 
   System.out.println(“Enter first name, last name, “
                      + “age, and weight separated “
                      + “by spaces.”);
   firstName = console.next();
   lastName  = console.next();
   age = console.nextInt();
   weight = console.nextDouble();

   System.out.println(“Name: “ +firstName+ “ “ + lastName);
   System.out.println(“Age: “ +age);
   System.out.println(“Weight: “ +weight);
 }
}
