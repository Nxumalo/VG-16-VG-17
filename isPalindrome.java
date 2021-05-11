public static boolean isPalindrome(String str){
  
  int len = str.length();
  int i,j;
  
  j = len - 1;
  
  for(i = 0; i <= (len - 1)/2; i++){
    
    if( str.charAt(i) != str.charAt(j))
      return false;
    j--;
  }
  return true;
  
}
