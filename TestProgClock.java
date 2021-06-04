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
    yourClock.printTim
    
  }
}
