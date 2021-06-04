public String toString(){
  
  String str = "";
  if( hr < 10)
    str = " 0 ";
  str = str + hr + ":";
  
  if(min < 10)
    str = str + "0";
  str = str + min + ":";
  
  if(sec < 10)
    str = str + "0";
  str = str + sec;
  
  return str;
  
}
