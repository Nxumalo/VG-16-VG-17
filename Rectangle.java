// This Java Program determines the area and perimeter of a rectangle 

import javax.swing.JOptionPane;

public class Rectangle {

  public static void main(String [] args){

     double width, length, area, perimeter;
 
     String lengthStr, widthStr, outputStr;

     lengthStr = JOptionPane.showInputDialog(“Enter the length: “);
     length = Double.parseDouble(lengthStr);

     widthStr = JOptionPane.showInputDialog(“Enter the width: “);
     width = Double.parseDouble(widthStr);

     area = length * width;
     perimeter = 2 * (length + width);

     outputStr = “Length: “ + length + “\n” +
                 “Width: “ + width + “\n” +
                 “Area: “ + area + “ square units\n” +
                 “Perimeter: “ + perimeter + “ units\n”;
    
     JOptionPane.showMessageDialog(null, outputStr, “Rectangle”, JOptionPane.INFORMATION_MESSAGE);
     System.exit(0);
 }
}

