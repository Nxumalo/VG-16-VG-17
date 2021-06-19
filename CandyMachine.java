import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CandyMachine extends JFrame{
  
  private static final int WIDTH = 300;
  private static final int HEIGHT = 300;
  
  // Instance Variables
  
  private CashRegister cashRegister = new CashRegister();
  private Dispenser candy = new Dispenser(100, 50);
  private Dispenser chips = new Dispenser(100, 65);
  private Dispenser gum = new Dispenser(75, 45);
  private Dispenser cookies = new Dispenser(100, 85);
  
  private JLabel headigMainL;
  private JLabel selectionL;
  
  private JButton exitB, candyB, chipsB, gumB, cookiesB;
  private ButtonHandler pbHandler;
  
  public CandyMachine(){
   
    setTitle("Candy Machine");   // set window title
    setSize(WIDTH, HEIGHT);      // set window size
    
    Container pane = getContentPane();      // get the container
    pane.setLayout(new GridLayout(7,1));    // set the pane layout
    
    pbHandler = new ButtonHandler();        // instantiate the listener object
     
    // instantiate the first label
    headingMainL = new JLabel("WELCOME TO MUIZENBERG'S CANDY SHOP",
                              SwingConstants.CENTER);
    
    selectionL = new JLabel("To Make a Selection, "
                            + "Click on the Product Button",
                            SwingConstants.CENTER);
    
    pane.add(headingMainL);
    pane.add(selectionL);
    
    candyB = new JButton("Candy"); // candy button     
    candyB.addActionListener(pbHandler); // register candy button
    
    chipsB = new JButton("Chips"); // chips button
    chipsB.addActionListener(pbHandler); // register chips button
    
    gumB  = new JButton("Gum"); // gum button
    gumB.addActionListener(pbHandler); // register gum button
    
    cookiesB = new JButton("Exit"); // cookies button
    cookiesB.addActionListener(pbHandler); // register cookies button
    
    exitB = new JButton("Exit"); // exit button
    exitB.addActionListener(pbHandler); // register exit button
    
    pane.add(candyB);   // add candy button to pane
    pane.add(chipsB);   // and chips button to pane
    pane.add(gumB);     // and gum button to pane
    pane.add(cookiesB); // and cookies button to pane
    pane.add(exitB);    // add exit button to pane
    
    setVisible(true);   // show 
    
    
    
    
                         
  }
}
