public class StrangeClass{
  
  public static void main(String [] args){
    
    int num = 0;
    
    while(num <= 29){
      
      if(strange(num))
        System.out.println("True");
      else
        System.out.println("False");
      
      num = num + 4;
      
    }
  }
  
  public static boolean strange(int n){
    
    if(n % 2 == 0 && n % 3 == 0)
      return true;
    else
      return false;
  }
}
