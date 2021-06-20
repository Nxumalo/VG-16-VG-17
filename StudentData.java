public class StudentData{
 
  private String firstName;
  private String lastName;
  
  private double[] testScores; // array to store the test score
  private char grade;
  
  // Default contructor
  public StudentData(){
   
    firstName = "";
    lastName = "";
    grade = '*';
    testScores = new double[5];
    
    // Constructor with parameters 
    
    public StudentData(String fName, String lName, double ... list){
     
      firstName = fName;
      lastName = lName;
      testScores = list;
      grade = courseGrade(list); // calculate and store the grade in grade
          
    }
    
    // Method to calucluate the grade
    public char courseGrade(double ... list){
     
      double sum = 0;
      double average = 0;
      
      for(
      
      
      
    }
  }
  
  
}
