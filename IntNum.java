public class IntNum{
  
  public static void main(String [] args){
    
    int num1;
    IntClass num2;
    
    num1 = 5;
    num2 = new IntClass(10);
    test(24,num2);
    test(num1, num2);
    test(num1 * num1, num2);
    test(num1 + num1,num2);
  }
  public static void test(int first,IntClass second){
    
    int third;
    
    third = first + second.getNum() * second.getNum() + 2;
    first = second.getNum() - first;
    second.setNum(2*second.getNum());
    System.out.println(first + " " + second + " " + third);
    
  }
}
