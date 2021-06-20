boolean isEqualArrays(int [] firstArray,int[] secondArray){
  
  if(firstArray.length != secondArray.length)
    return false;
  
  for(int index = 0; index < firstArray.length; index++)
    if(firstArray[index] != secondArray[index])
      // the corresponding elements are different
      return false;
  return true;
  
}
