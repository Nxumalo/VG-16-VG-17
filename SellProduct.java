public static void SellProduct(Dispenser product, CashRegister cRegister){
 
  int price;            // product price
  int coinsInserted;    // amount entered
  int coinsRequired;    // extra amount need
  
  if(product.getCount() > 0){
   
    price = product.getProductCost();
    coinsRequired = price;
    coinsInserted = 0;
    
    while(coinsRequired > 0){
     
      System.out.print("Please deposit "+coinsRequired+ " cents: ");
      coinsInserted = coinsInserted + console.nextInt();
      coinsRequired = price - coinsInserted;
    } 
    
    System.out.println();
    cRegister.acceptAmount(coinsInserted);
    product.makeSale();
    System.out.println("Collect your item at the bottom and enjoy .\n");
  }
  else
    System.out.println("Sorry this item is sold out. \n");
}
