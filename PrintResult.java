public static void PrintResult(PrintWriter outp, String courseId, int groupNo, DoubleClass avg){
  
  if(groupNo == 1)
    outp.print("  "+ courseId +"  ");
  else
    outp.print("     ");
  
  outp.println("%9d %15.2f%n", groupNo, avg.getNum());
  
}
