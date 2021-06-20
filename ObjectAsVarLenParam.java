public class ObjectAsVarLenParam{
 
  public static void main(String [] args){
   
    Clock myClock = new Clock(12, 5, 10);
    Clock yourClock = new Clock(8, 15, 6);
    
    Clock[] arrivalTimeEmp = new Clock[10];
    
    for(int j = 0; j < arrivalTimeEmp.length; j++)
      arrivalTimeEmp[j] = new Clock();
    
    arrivalTimeEmp[5].setTime(8, 5, 10);
    
    printTimes(myClock, yourClock);
    
    System.out.println("\n*********************************************\n");
    
    printTimes(arrivalTimeEmp);
  
  }
  
  public static void printTimes(Clock ... clockList){
   
    for(int i = 0; i < clockList.length; i++)
      System.out.println(clockList[i]);  
  }
}
