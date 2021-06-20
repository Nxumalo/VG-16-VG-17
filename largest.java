public static double largest( double .. numList){
  
  double max;
  int index;
  
  if(numList.length != 0){
    
    max = list[0];
    
    for(index = 1; index < numList.length; index++){
     
      if(max < numList[index])
        max = numList [index];
      
    }
    return max;
  }
  return 0.0;
}
