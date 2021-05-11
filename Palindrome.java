// Program Palidrome

import java.swing.JOptionPane;

public class Palindrome{
  
  public static void main(String [] args){
    
    long num, temp;
    String inputStr, outputStr;
    
    inputStr = JOptionPane.showInputDialog("Enter an integer, positive or negative");
    
    num = Long.parseLong(inputStr);
    temp = num;
    
    if(num <= 0){
      num = -num;
      inputStr = inputStr.valueOf(num);
    }
    if(isPalindrome(inputStr))
      outputStr = temp + " is a palindrome";
    else
      outputStr = temp + " is not a palindrome";
    
    JOptionPane.showMessageDialog(null, outputStr, "Palindrome Program", 
                                  JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
  }
  public static boolean isPalindrome(String str){
    
    int len = str.length();
    int i,j;
    
    j = len - 1;
    
    for(i = 0; i <= (len - 1)/2; i++){
      
      if(str.charAt(i) != str.charAt(j))
        return false;
      j--;
    }
    return true;
  }
  
}
