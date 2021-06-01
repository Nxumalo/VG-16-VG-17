public class MysteryClass{
  
  public static void main(String [] args){
    
    int n;
    for(n = 1; n <= 5; n++)
      System.out.println(mystery(n));
  }
  
  public static int mystery(int k){
    
    int x,y;
    
    y = k;
    
    for(x = 1; x <= (k - 1); x++)
      y = y * (k - x);
     
    return y;
               
  }
} 
