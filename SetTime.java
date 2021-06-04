public static SetTime(int hours, int minutes, int seconds){
  
  if(0 <= hours && hours < 24)
    hr = hours;
  else
    hr = 0;
  
  if(0 <= minutes && minutes <60)
    min = minutes;
  else
    min = 0;
  
  if(0 <= seconds && seconds < 60)
    sec = seconds;
  
  else 
    sec = 0;
 
}
