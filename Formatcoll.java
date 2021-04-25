public class Formatcoll{
 public static void main (String [] args){
  
   int num = 763;
   double x = 658.75;
   String str = “Java System Program”;

   System.out.println(“123456789012345678901234567890”);
   System.out.printf(“%-5d%-7.2f%-15s ***%n”,num,x,str);
   System.out.printf(“%-15s%-6d%-9.2f ***%n”,str,num,x);
   System.out.printf(“%-8.2f%-7d%-15s ***%n”,x,num,str);

   System.out.printf(“num = %-5d ***%n”,num);
   System.out.printf(“x = %-10.2f ***%n”,x);
   System.out.printf(“str = %-15s ***%n”,str);
   System.out.printf(“%-10s%-7d ***%n”,”Program No.”,4);
 }
}
