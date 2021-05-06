public class WhatIsTheOutput{
   
   public static void main(String [] args){

       int x, y, z;

       x = 4;
       y = 5;
       z = y + 6;

       while(((z - y) % 4) != 0){
         System.out.print(z + “ “)
         z = z + 7;
       }
       System.out.println();
  }
}
