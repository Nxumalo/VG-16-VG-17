// Determine the absolute value of an integer

import javax.swing.JOptionPane;

public class AbsoluteValue{

 public static void main(String [] args){

   int number;
   int temp;
   String numString;
   numString = “JOptionPane.showInputDialog(“Enter an integer: “);
   
   number = Integer.parseInt(numString);
   temp = number;

   if(number < 0)
      number -= number;

   JOptionPane.showMessageDialog(null,”The absolute value of “ + temp + “ is “ 
               + number, “Absolute Value”,JOptionPane.INFORMATION_MESSAGE);
   System.exit(0);
 }
}
