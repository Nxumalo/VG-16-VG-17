public Clock GetCopy(){
  
  Clock temp = new Clock();
  
  temp.hr = hr;
  temp.min = min;
  temp.sec = sec;
  
  return temp;
  
}
