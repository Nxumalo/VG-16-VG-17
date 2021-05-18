private void sellProduct(Dispenser product, String productName){
   
  int coinsInserted = 0;
  int price, coinsRequired;
  String str;
  
  if(product.getCount() > 0){
    
    price = product.getProductCost();
    coinsRequired = price - coinsInserted;
    while(coinsRequired > 0){
      
      str = JOptionPane.showInputDialog("To buy productName please insert coinsRequired cents");
      coinsInserted = coinsInserted + Integer.parseInt(str);
      coinsRequired = price - coinsInserted;
      
    }
    
    cashRegister.acceptAmount(coinsInserted);
    product.makeSale();
    
    JOptionPane.showMessageDialog(null,"Please pick up your "+ productName +" and enjoy, Thank you, Come again!",
                                  JOptionPane.PLAIN_MESSAGE);
  }
  else
    JOptionPane.showMessageDialog(null,"Sorry "+productName+ " is sold out\n Make another selection","Thank you, Come again！",
                                  JOptionPane.PLAIN_MESSAGE);
                                  
  
}
