public void SethisTime(int hr, int min, int sec){
  
  if(0 <= hr && hr < 24)
    this.hr = hr;
  else
    this.hr = 0;
  
  if(0 <= min && min < 60)
    this.min = min;
  else
    this.min = 0;
  
  if(0 <= sec && sec < 60)
    this.sec = sec;
  else 
    this.sec = 0;

}
