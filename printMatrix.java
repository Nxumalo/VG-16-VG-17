public static void printMatrix(int [][] matrix){
 
  int row, col;
  
  for(row = 0; row < matrix.length; row++){
   
    for(col = 0; col < matrix[row].length; col++)
      System.out.printf("%7d",matrix[row][col]);
    
    System.out.println();
    
  }  
}
