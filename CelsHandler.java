private class CelsHandler implements ActionListener {
 
   public void actionPerformed (ActionEvent e){

      double celsius, fahrenheit;

      celsius = Double.parseDouble(celsiusTF.getText());
      fahrenheit = celsius * CTOF + OFFSET;
      fahrenheitTF.setText(String.format(“%.2f”,fahrenheit));
 }
}
