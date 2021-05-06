// Java Program to create a window 

public class RectangleProgram extends JFrame{

    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;


    public RectangleProgram() {

      setTitle(“Area and Perimeter of a Rectangle”);
      setSize(WIDTH, HEIGHT);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main (String [] args){
      RectangleProgram rectProg = new RectangleProgram ();
    }
