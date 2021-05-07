// Java Program to convert the temperature from Celsius to
// Fahrenheit and vice vesa.

import javax.swing.*;

public class TempConversion extends JFrame {
  
   private static final int WIDTH = 500;
   private static final int HEIGHT = 50;

   private static final double FTOC = 5.0 / 9.0;
   private static final double CTOF = 9.0 / 5.0;
   private static final int OFFSET = 32;

   public TempConversion(){
      
      setTitle(“Temperature Conversion”);
      setSize(WIDTH,HEIGHT);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

   public static void main (String [] args){

      TempConversion temConv = new TempConversion();

   }
}
