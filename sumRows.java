public static void sumRows(int [][] matrix){
 
  int row, col;
  int sum;
  
  // sum of each individual row
  
  for(row = 0; row < matrix.length; row++){
   
    sum = 0;
    
    for(col = 0; col < matrix[row].length; col++)
      sum = sum + matrix[row][col];
    
    System.out.println("The sum of the elements of row "
                       + (row + 1) + " = " +sum);
    
  }
}
