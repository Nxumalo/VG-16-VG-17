public Dispenser0(int setNoOfItems, int setCost){
 
  if(setNoOfItems >= 0)
    numberOfItems = setNoOfItems;
  else
    numberOfItems = 50;
  
  if(setCost >= 0)
    cost = setCost;
  else
    cost = 50;
  
  
}
