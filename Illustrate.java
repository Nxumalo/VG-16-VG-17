public class Illustrate{
  
  private int x;
  private static int y;
  public static int count;
  
  // Default Contructor
  
  public Illustrate(){
    
    x = 0;
    
  }
  
  // Method to set x.
  
  void setX(int a){
    
    x = a;
    
  }
  
  // Method to return the values of the instance 
  // and static variables as a string.
  
  public String toString(){
    
   return ("x = "+ x + ", y = "+ y +", count = "+ count);
    
  }
  
  // Method to increment the values of the private member y
  
  public static void incrementY(){
   
    y++;
  }
}
