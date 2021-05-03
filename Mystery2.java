public class Mystery2{

   static final int ONE = 5;

   public static void main (String [] args){

      int x, y, w, z;
      z = 9;

      if (z > 10){
          x = 12;
          y = 5, w = x + y + ONE;
      }
      else{
          x = 12;
          y = 4, w = x + y + ONE;
      }
      System.out.println(“w = “+ w);
  }
}

