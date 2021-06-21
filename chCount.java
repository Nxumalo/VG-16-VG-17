static void chCount(char ch, int[] letterC){

  int index;
  int i;
  
  ch = Character.toUpperCase(ch);
  index = (int) ch - 65;
  if ( index >= 0 && index < 26)
        letterC[index]++;
}
