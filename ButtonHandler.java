private class ButtonHandler implements ActionListener{

  public void actionPerformed(ActionEvent e){
    
    if (e.getActionCommand().equals("Exit"))
      System.exit(0);
    else if(e.getActionCommand().equals("Candy"))
      sellProduct(candy,"Candy");
    else if(e.getActionCammand().equals("Chips"))
      sellProduct(chips,"Chips");
    else if(e.getActionCammand().equals("Gum"))
      sellProduct(gum, "Gum");
    else if(e.getActionCammand().equals("Cookies"))
      sellProduct(cookies, "Cookies");
      
  }
  
} 
