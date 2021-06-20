public static void largestinRows(int [][] matrix){
 
  int row, col;
  int largest;
  
  // The largest element in each row 
  for(row = 0; row < matrix.length; row++){
    // assume that the first element of the row is the largest
    largest = matrix[row][0]; 
    for(col =1; col < matrix[row].length;col++)
      if(largest < matrix[row][col])
         largest = matrix[row][col];
    
    System.out.println("The largest element of row"
                      + (row + 1) + " = " + largest);
           
  } 
}
