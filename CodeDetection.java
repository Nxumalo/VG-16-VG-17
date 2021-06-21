// Code Detection

import java.io.*;
import java.util.*;

public class  CodeDetection{
 
  static final int maxCodeSize = 250;
  
  public static void main(String [] args) throws FileNotFoundException{
   
    int [] codeArray = new int[maxCodeSize];
    int codeLength;
    
    Scanner codeFile = new Scanner(new FileReader("a:\\SecretCode.txt"));
    PrintWriter outFile = new PrintWriter("a:\\SecretCodeOut.txt");
    
    codeLength = codeFile.nextInt();
  
    if(codeLength <= maxCodeSize){
    
      readCode(codeFile,codeArray, codeLength);
      compareCode(codeFile,outFile,codeArray,codeLength);
    }
    else
      System.out.println("Length of the secret code must be <= " +maxCodeSize);
    
    codeFile.close();
    outFile.close();
  }
}
