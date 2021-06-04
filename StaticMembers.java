public class SstaticMembers{
  
 public static void main(String [] args){
   
   Illustrate illusObject1 = new Illustrate(3);
   Illustrate illusObject2 = new Illustrate(5);
   
   Illustrate.incrementY();
   Illustrate.count++;
   
   System.out.println(illusObject1);
   System.out.println(illusObject2);
   System.out.printn("Line 7: *** Increment y using IllusObject1 ***");
   
   illusObject1.incrementY();
   illusObject2.setX(8);
   System.out.println(illusObject1);
   System.out.println(illusObject2);
   
   System.out.println("Line 12: *** Increment y using IllusObect2 ***");
   illusObject2.incrementY();
   illusObeject2.setX(23);
   System.out.println(illusObject1);
   System.out.println(illusObject2);
             
  }
}
