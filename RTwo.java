public class RTwo extends JFrame{
  
  public RTwoProgram(){
    
    private JLabel length, width, area;
    
    setTitle("Good day area");
    
    length = JLabel("Enter the length");
    width = JLabel("Enter the width");
    area = JLabel("Area: ");
    containerPane = ContentPane();
    pane.setLayout(GridLayout(4,1));
    setSize(WIDTH,HEIGHT);
    setVisible();
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
   
  public static void main( String [] args){
    
    RTwoProgram R2 = new RTwoProgram();
    
  }
  
}
