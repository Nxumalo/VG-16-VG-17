public class AA{
  
  private int x;
  private int y;  
  
  public void print(){
    
    System.out.println(x + " " + y);
    
  }
  
  public int sum(){
    
   return x + y; 
  }
  
  public AA(){
   
    x = 0;
    y = 0;
  }
  
  public int AA (int a, int b){
   
    x = a;
    y = b;
    
  }
}
