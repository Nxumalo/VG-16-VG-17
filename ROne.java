import javax.jswing.*;

public class ROne extends JFrame {

   static private final int WIDTH = 400;
   static private final int HEIGHT = 300;

   public RectangleProgramOne(){

       setTitle(“Welcome”);
       setSize(WIDTH,HEIGHT);
       setVisible(true);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   public static void main(String [] args){

        ROne r1 = new ROne();
   }

}

