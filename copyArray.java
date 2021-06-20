// Method to copy one array into another array

public static void copyArray(int [] list1, int [] list2, int noOfElements){
 
  int index;
  
  for(index = 0; index < noOfElements; index++)
    list2[index] = list1[index];
  
  
}
