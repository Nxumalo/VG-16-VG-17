// Method to find and return the index of the largest element

public static int indexLargestElement(int [] list, int noOfElements){
 
  int index;
  int maxIndex = 0;  // assume the fist element is the largest
  
  for(index = 1; index < noOfElements; index++)
    if(list[maxIndex] < list[index])
      maxIndex = index;
  return maxIndex;
  
  
}
