public class CascadedMethodCalls{
 
  public static void main(String [] args){
   
    Person student1 = new Person("Fraser","Nxumalo");
    
    Person student2 = new Person();
    
    Person student3 = new Person();
    
    System.out.println("Line 4 -- Student 1: "+ student1);
    
    student2.setFirstName("Shelly").setLastName("Malik");
    
    System.outt.println("Line 6 -- Student 2: "+ student2);
    
    student3.setFirstName("Chelsea");
    
    System.out.println("Line 8 -- Student 3: "+ student3);
    
    student3.setLastName("Calvet");
    
    System.out.println("Line 10 -- Student 3: "+ student3);
    
  }
  
  
}
