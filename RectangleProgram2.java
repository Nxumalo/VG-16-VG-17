// Java Program to create a window and place four labels 

import javax.swing.*;
import java.awt.*;

public class RectangleProgram2 extends JFrsme {

   private static final int WIDTH = 400;
   private static final int HEIGHT = 300;
  
   private JLabel lengthL, widthL, areaL, perimeterL;

   public RectangleProgram2(){
      
      setTitle(“Area and Perimeter of a Rectangle”);

      lengthL = new JLabel (“Enter the length: “, SwingConstants.RIGHT);
      widthL = new JLabel (“Enter the width: “, SwingConstants.RIGHT);
      areaL = new JLabel (“Area: “, SwingConstants.RIGHT);
      perimeterL = new JLabel(“Perimeter: “, SwingContants.RIGHT);

      Container pane = getContentPane();
      pane.setLayout(new GridLayout(4,1));
      pane.add(lengthL);
      pane.add(widthL);
      pane.add(areaL);
      pane.add(perimeterL);

      setSize(WIDTHL, HEIGHT);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   
      public static void main (String [] args){
         RectangleProgram2 rectObject = new RectangleProgram2();
      }
   }
}
