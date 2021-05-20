// Parameter Passing
public class ParaPass{
  
  int num1;
  IntClass num2 = nee IntClass();
  char ch;
  StringBuffer str;
  
  num1 = 10;
  num2.setNum(15);
  ch = 'A';
  str = new StringBuffer("Sunny");
  
  System.out.println("Line 9: Insaid main: num1 = "+num1+", ch = " 
                     +ch+ ", and str = " +str);
  funcOne(num1 , num2, ch, str);
  
  System.out.println("Line 1: After funcOne num1 = " +num1+", num2 = "
                     +num2.getNum() +", ch = " + ch + ", and str = " +str);
  
  public static void funOne(int a, IntClass b, char v, StringBuffer pstr){
    
    int num;
    int len;
    
    num = b.getNum();
    a++;
    b.addtoNum(12);
    v = 'B';
    len = pStr.length();
    pStr.delete(0, len);
    pStr.append("Warm");
    
    System.out.println("Line 21: Inside funcOne: \n              a = "
                       +a+", b"+ b.getNum()+", v"+v+ ", pStr = " +pStr+
                       ", len = " + len+
                       ", and num = "+ num);
                       
    
    
  }
                            
  
  
}
