// Line and letter count word count

import java.io.*;

public class CharacterCount{
 
  public static void main (String [] args) throws FileNotFoundException,
                        IOException{
  
         int lineCount = 0;
         int[] letterCount = new int[26];
         IntClass next = new IntClass();
         FileReader inputStream = new FileReader("a:\\text.txt");
         PrintWriter outfile = new PrintWriter("a:\\textCh.txt");
         
         next.setNum(inputStream.read());
         while(next.getNum() != -1){
               copyText(inputStream, outfile, next, letterCount);
               lineCount++;
               next.setNum(inputStream.read());
         }
                          writeTotal(outfile, lineCount, letterCount);
                          outfile.close();
     }
  
      static void copyText(FileReader infile, PrintWriter outfile,
                  IntClass next, int[] letterC) throws IOException{
       
        while(next.getNum() != (int) '\n'){
         
          outfile.print((char)(next.getNum())):
          chCount((char)(next.getNum()), letterC);
          next.setNum(infile.read());
        }
        outfile.println();
      }
  
      static void chCount(char ch, int[] letterC){
       
        int index;
        int i;
        
        ch = Character.toUpperCase(ch);
        index = (int) ch - 65;
        if (index >= 0 && index < 26)
          letterC[index]++;
      }
  
      static void writeTotal(PrintWriter outfile, int lines, int[] letters){
       
        int i;
        outfile.println();
        outfile.println("The numbers of lines = " + lines);
        
        for(i = 0; i < 26; i ++)
          outfile.println((char)(i + 65) + " count = " + letters[i]);
        
      }
}
