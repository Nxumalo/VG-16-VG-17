public class TwoDimArrayParam{
 
  public static void main(String[] args){
   
    int [][] board = {{23, 5, 6, 15, 18},
                      {4, 15, 45, 97, 10},
                      {12, 56, 32, 96, 11},
                      {1, 24, 35, 23, 8},
                      {94, 56, 32, 78, 33},
                      {24, 34, 56, 78, 9}};
    
    printMatrix(board);
    System.out.println();
    sumRows(board);
    System.out.println();
    largestinRows(board);
    
  }
  public static void printMatrix(int [][] matrix){
   
    int row,col;
    
    for(row = 0; row < matrix.length; row++){
     
      for(col = 0; col < matrix[row].length; col++)
        System.out.printf("%7d",matrix[row][col]);
      
      System.out.println();
      
    }
  }
  
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
  
  public static void largestinRows(int [][] matrix){
    
    int row, col;
    int largest;
    
    // the largest element in each row 
    for(row = 0; row < matrix.length; row++){
     // assume the first element of the row is the largest
      largest = matrix[row][0];
      
      for(col = 1; col < matrix[row].length; col++)
        if(largest < matrix [row][col])
          largest = matrix[row][col];
      
      System.out.println("The largest element of row "
                         + (row + 1) + " = " +largest);
      
    }
  }
}
