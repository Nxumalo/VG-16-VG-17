public class Person0{
  
  private String firstName;           // first name
  private String lastName;            // last name
  
  // Default Constructor
  
  public Person(){
   
    firstName = "";
    lastName = "";  
  }
 
  // Constructor with Parameters
  
  public Person(String first, String last){
   
    setName(first,last);
    
  }
  
  // Method to return first and last name
  
  public String toString(){
   
    return (firstName + " " + lastName);    
  }
  // Method to set the first and last name 
  
  public void setName(String first, String last){
   
    firstName = first;
    lastName = last;  
  }
  // Method to set last Name
  
  public Person setLastName(String last){
   
    lastName = last;
    return this;
  }
  // Method to set first Name
  public Person setFirstName(String first){
   
    firstName = first;
    return this;
   
  }
  // Method to return first Name
  
  public String getFirstName(){
   
    return firstName;
    
  }
  // Function to return last Name
  
  public String getLastName(){
  
    return lastName;
  }
}
