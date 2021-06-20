class CC{
 
  private int u;
  private int v;
  private double w;
  
  public CC (){
    
    u = 0;
    v = 0;
    w = 0.0;
      
  }
  
  public CC (int a){
   
    u = a;
    
  }
  
  public CC (int a, int b){
  
    u = a;
    v = b;
    
  }
  
  public CC (int a, int b, double d){
   
    u = a;
    v = b;
    w = d;
    
  }
  
  public void print(){
   
    System.out.println(u + " " + v + " " + w);
    
  }
}
