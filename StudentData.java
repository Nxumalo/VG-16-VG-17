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
      
      for(double num: list)
       sum = sum + num; // sum the test score
     
      if(list.length != 0)
       average = sum / list.length;
     
      if(average >= 90)
       return 'A';
     
      else if (average >= 80)
            return 'B';
     
      else if (aveage > 70)
           return 'C';
     
      else if (average > 60)
           return 'D';
      
      else
          return 'F';
      
    }
   
   // Method to return a student's name, test scores, and grade as a string
   
   public String toString(){
    
    String str;
    
    str = String.format("%-10s %-10s ", firstName, lastName);
    
    for(double score: testScores)
       str = str + String.format("%7.2f", score);
    
    str = str + "  " + grade;
    
    return str;
    
    
   }
  
}
