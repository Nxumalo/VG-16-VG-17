static void copyText(FileReader infile, PrintWriter outfile, intClass next,
                     int [] letterC) throws IOException{
 
  while(next.getNum() != (int) '\n') {    // Process the entire line
   
    outfile.print((char)(next.getNum()));
    chCount((char)(next.getNum()), letterC);
    
    next.setNum(infile.read());
  
  }
  outfile.println();
}
                     
                    
