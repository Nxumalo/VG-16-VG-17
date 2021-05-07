// Java Program to convert the temperature between Celsius
// Fahrenheit 

import java.awt.*;           //due to the class Container 
import java.awt.event*;      //due to events
import java.swing.*;         //due to JLabel and  JTextField 


public class TempConversion0 extends JFrame {

    private JLabel celsiusLabel;
    private JLabel fahrenheitLabel;
    private JTextField celsiusTF;
    private JTextField fahrenheitTF;
    private CelsHandler celsiusHandler;
    private FahrHandler fahrenheitHandler;

    private static final int WIDTH = 500;
    private static final int HEIGHT = 50;
    private static final double FTOC = 5.0 / 9.0;
    private static final double CTOC = 9.0 / 5.0;
    private static final int OFFSET = 32;

    public TempConversion0 (){

       setTitle(“Temperature Conversion”);
       Container c = getContentPane ();
       c.setLayout(new GridLayout (1,4));

       celsiusLabel = new JLabel (“Temp in Celsius: “, SwingConstants.RIGHT);
       fahrenheitLabel = new JLabel (“Temp in Fahrenheit: “, SwingConstants.RIGHT);

       celsiusTF = new JTextField(7);
       fahrenheitTF = new JTextField(7);

       c.add(celsiusLabel);
       c.add(celsiusTF);
       c.add(fahrenheitLabel);
       c.add(fahrenheitTF);

       celsiusHandler = CelsHandler();
       fahrenheitTF.addActionListener(fahrenheitHandler);

       setSize(WIDTH, HEIGHT);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setVisible(true); 
    }
    private class CelsHandler implements ActionListener {
  
       public void actionPerformed(ActionPerformed e){
           
          double celsius, fahrenheit;
          celsius = Double.parseDouble(celsiusTF.getText());
          fahrenheit = celsius * CTOF + OFFSET;
          fahrenheitTF.setText(String.format(“%.2f”,fahrenheit));

       }
    }

    private class FahrHandler implements ActionListener {

        public void actionPerformed (ActionEvent e){

           double celsius, fahrenheit;
        
           fahrenheit = Double.parseDouble(fahrenheitTF.getText());
           celsius = (fahrenheit - OFFSET) * FTOC);
           celsiusTF.setText(String.format(“%.2f”,celsius));
        }
    }

    public static void main (String [] args){
   
       TempConversion0 tempConv = new TempConversion0();
    }
 }
