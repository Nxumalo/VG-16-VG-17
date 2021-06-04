public class Clock{
  
  private int hr;          // hours
  private int min;         // minutes
  private int sec;         // seconds
  
  // Default constructor
  // Post Condition: hr = 0; min = 0; sec = 0;
  
  public Clock (){
    
    setTime(0,0,0);
  }
  
  // Constructor with parameters to set time
  // Time according to the parameters
 
  public Clock(int hours,int minutes, int seconds){
    
    setTime(hours,minutes,seconds);
    
  }
  
  // Method to set the time
  // Time according to parameters
  
  public void setTime(int hours, int minutes, int seconds){
    
    if(0 <= hours && hours < 24)
      hr = hours;
    
    else
      hr = 0;
    
    if(0 <= minutes && minutes < 60)
      min = minutes;
    else
      min = 0;
    
    if(0 <= seconds && seconds < 60)
      sec = seconds;
    else
      sec = 0;
  }
  
  // Method to return Hours
  
  public int getHours(){
    
    return hr;
    
  }
  
  // Method to return Minutes
  
  public int getMinutes(){
    
   return min;
    
  }
    
  // Method to return Seconds
  
  public int getSeconds(){
   
    return sec;
    
  }
  
  // Method to print Time
  
  public void printTime(){
    
    if(hr < 10)
      System.out.print("0");
    System.out.print(hr + ":");
    
    if(min < 10)
      System.out.print("0");
    System.out.print(min + ":");
    
    if(sec < 10)
      System.out.print("0");
    System.out.print(sec);
    
  }
  
  // Method to increment the time by one second;
  // If the before-increment time is 23.59.59, the time
  // is reset to 00:00:00
  
  public void incrementSeconds(){
    
    sec++;
    if(sec > 59){
      
      sec = 0;
      incrementMinutes();
      
    }
  }
    // Method to increment the time by one minutes
    // If the before increment time is 23.59.53 the time
    // is reset to 00:00:53
    
    public void incrementMinutes(){
      
      min++;
      if(min > 59){
       
        min = 0;
        incrementHours();
        
      }
    }
    
    // Method to increment the time by one Hours
    // If the before-increment time isi 23:45:53 the time
    // is reset to 00:45:53
    
    public void incrementHours(){
      
      hr++;
      if(hr > 23)
        hr = 0;
      
    }
    
    // Method to compare two time
    
    public boolean equals(Clock otherClock){
      
      return(hr == otherClock.hr 
             && min == otherClock.min
             && sec == otherClock.sec);
      
    }
    
    // Method to copy time
    
    public void makeCopy(Clock otherClock){
      
      hr = otherClock.hr;
      min = otherClock.min;
      sec = otherClock.sec;
        
    }
    
  // Method to return a copy of time
  
    public Clock getCopy(){
      
      Clock temp = new Clock();
      
      temp.hr = hr;
      temp.min = min;
      temp.sec = sec;
      
      return temp;
    }
  }
