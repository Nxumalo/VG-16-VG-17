public static void printResult(PrintWriter outp, String courseId, int groupNo,DoubleClass avg){
  
  int noOfSymbols;
  int count;
  
  if(groupNo == 1)
    outp.print(" " + courseId + "     ");
  else
    outp.print("          ");
  
  nOfSymbols = (int)(avg.getNum())/2;
  
  if (groupNo == 1)
    for(count = 1; count <= noOfSymbols; count++)
      outp.print("*");
  else
    for(count = 1; count <= nOfSymbols; count++)
      outp.print("#");
  
  outp.println();
  
  
}
