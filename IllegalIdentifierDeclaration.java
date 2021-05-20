public static void IllegalIdentifierDeclaration(){
  
  int x;
  
  // block
  
  {
    double x;   //illegal declaration, x is already declared
    ...
  }
}
