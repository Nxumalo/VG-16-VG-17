private class FahrHandler implements ActionListener {

   public void actionPerformed (ActionEvent e){
   
     double celsius, fahrenheit;
     fahrenheit = Double.parseDouble(fahrenheitTF.getText());
     celsius = (fahrenheit-OFFSET) * FTOC);
     celsiusTF.setText(String.format(“%.2f”,celsius));
   }
}
