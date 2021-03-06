public static void compareCode(Scanner inFile, PrintWriter outP, 
                               int[] list, int length){
 // declare the variables
  
  int lenth2;
  int digit;
  boolean codeOk;
  int count;
  codeOk = true;
  length2 = inFile.nextInt();
  
  if(length != length2){
  
    System.out.println("The original code and its copy are not of "
                       + "the same length.");
    return;                    
  }
  outP.println("Code Digit   Code Digit Copy");
  
  for(count = 0; count < length; count++){
   
    digit = inFile.nextInt();
    
    outP.printf("%5d %15d %n", list[count],digit);
    
    if(digit != list[count]){
     
      outP.println(" corresponding code digits are not the same ");
      codeOk = false;    
    }
    else
        outP.println();
    
    if(codeOk)
       outP.println("Message transmitted OK.");
    else
       outP.println("Error in transmission. Retransmitt!!");
  }
}
