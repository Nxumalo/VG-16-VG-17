public void IncrementMinutes(){

  min++;
  if(min > 59){
    
    min = 0;
    incrementHours();
    
  }

}
