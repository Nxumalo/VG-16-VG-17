public void IncrementhisTime(){
 
  this.sec++;
  if(this.sec < 59){
    
    this.sec = 0;
    this.IncrementMinutes();     // Increment Min   
  }
}
