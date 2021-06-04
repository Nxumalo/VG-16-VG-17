// Test the various Operations of the Class Clock

import java.util.*;

public class TestProgClock{
  
  static Scanner console = new Scanner (System.in);
  
  public static void main(String [] args){
    
    Clock myClock = new Clock(5,4,30);
    Clock yourClock = new Clock();
    
    int hours;
    int minutes;
    int seconds;
    
    System.out.print("Line 6: myClock: ");
    myClock.printTime();
    System.out.println();
    
    System.out.print("Line 9: yourClock: ");
    yourClock.printTime();
    System.out.println();
    
    yourClock.setTime(5, 45, 16);
    
    System.out.print("Line 13: After setting the time, yourClock: ");
    yourClock.printTime();
    System.out.println();
    
    if(myClock.equals(yourClock))
      System.out.println("Line 17: Both the times are equal.");
    else
      System.out.println("Line 19: The two times are not equal.");
    
    System.out.print("Line 20: Enter the hours, minutes, and seconds: ");
    
    hours = console.nextInt();
    minutes = console.nextInt();
    seconds = console.nextInt();
    System.out.println();
    
    myClock.setTime(hours, minutes, seconds);
    System.out.print("Line 26: New time of myClock: ");
    myClock.printTime();
    System.out.println();
    
    myClock.incrementSecond();
    
    System.out.print("Line 30: After incrementing the time by one second, myClock: ");
    
    myClock.printTime();
    System.out.println();
    
    yourClock.makeCopy(myClock);
    System.out.print("Line 34: After copying myClock int yourClock, yourClock: ");
    
    yourClock.printTime();
    System.out.println();
    
  }
}
