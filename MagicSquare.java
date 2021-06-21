public class MagicSquare{

    static final int rows = 4;
    static final int coloumns = 4;
  
    static final int listSize = 16;
    ...
    public static void main(String [] args){
     
      int[] list = new int[listSize];
      int[][] matrix = new int[rows][columns];
      
      createArithmeticSeq(lisit);
      matricsize(list, matrix);
      printMatrix(matrix);
      reverseDiagonal(matrix);
      printMatrix(matrix);
      magicCheck(list, matrix);
      
    }
}
