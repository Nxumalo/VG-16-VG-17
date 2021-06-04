public class Person{
  
  private String firstName;    // store the first name
  private String lastName;     // store the last name
  
  // Default constructor
  
  public Person(){
    
    firstName = "";
    lastName = "";
    
  }
  
  // Constructor with paramenters
  
  public Person(String first, String last){
    
    setName(first,last);
    
  }
  
  // Method to output the first and last name
  
  public String toString(){
    
   return (firstName + " " + lastName); 
  }
  
  // Method to set first and last name occording to parameters
  
  public void setName(String first, String last){
    
    firstName = first;
    lastName = last;
  }
  
  // Method to return first name
  
  public String getFirstName(){
    
    return firstName;
    
  }
  
  // Method to return last Name 
  
  public String getLastName(){
    
    return lastName;
    
  }
  
}
