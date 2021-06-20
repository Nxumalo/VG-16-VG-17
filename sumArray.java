// Method to find and return the sum of the elements

public static int sumArray(int [] list, int noOfElements){

   int index;
   int sum = 0;
   
   for(index = 0; index < noOfElements; index++){
    
      sum = sum + list[index];
   }
   return sum;
}
