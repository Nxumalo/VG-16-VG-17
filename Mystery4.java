public class Mystery4{
 
   public static void main(String [] args){
       
      int x, y, z;

      x = 4;
      y = 5;
      z = y + 6;

      do{
         System.out.print(z + “ “);
         z = z + 7;
      }
      while(((z - x) % 4) != 0);
      System.out.println();
   }
}
