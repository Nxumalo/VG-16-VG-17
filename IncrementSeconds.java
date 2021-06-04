public void IncrementSeconds(){
  
  sec++;
  if(sec > 59){
    
    sec = 0;
    IncrementMinutes();
  }
}
