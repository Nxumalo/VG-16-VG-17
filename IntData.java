import java.util.*;

public class IntData{
  
  static Scanner console = new Scanner(System.in);
  
  public static void main(String [] args){
    
    int first, third;
    IntClass second, fourth;
    
    first = 3;
    second = new IntClass(4);
    third = 6;
    fourth = new IntClass(7);
    
    System.out.println(first + " " + second.getNum() + " " + third + " " + fourth.getNum());
    getData(first,second,third,fourth);
    System.out.println(first + " " + second.getNum() + " " + third + " " + fourth.getNum());
    fourth.setNum(first * second.getNum() + third + fourth.getNum());
    getData(third, fourth, first, second);
    System.out.println(first + " " + second.getNum() + " " + third + " " + fourth.getNum());
   
  }
  public static void getData(int a, IntClass b, int c, IntClass d){
    
    a = console.nextInt();
    b.setNum(console.nextInt());
    c = console.nextInt();
    d.setNum(console.nextInt());
    
    b.setNum(a * b.getNum() - c);
    d.setNum(b.getNum() + d.getNum());
    
  }
}
