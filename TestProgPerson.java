public class TestProgPerson{
  
  public static void main(String [] args){
   
    Person name = new Person();
    
    Person emp = new Person("Donald","Jackson");
    
    System.out.println("Line 3: name: " +name);
    
    name.setName("Ashley","Blair");
    System.out.println("Line 5: name: " +name);
    
    System.out.println("Line 6: emp: " +emp);
    
    emp.setName("Sandy", "Smith");
    System.out.println("Line 8: emp: " +emp);
  
  }
}
