private class CalculateButtonHandler implements ActionListenr {

   public void actionPerformed(ActionEvent e){
 
     double width, length, area, perimeter;

     length = Double.parseDouble(lengthTF.getText());
     width = Double.parseDouble(widthTF.getText());
     area = length * width;
     perimeter = 2 * (length + width);

     areaTF.setText(“ “ + area);
     perimeterTF.setText(“ “+ perimeter);
  }
}
