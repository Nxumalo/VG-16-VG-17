public class Mystery3{

   public static void main (String [] args){

     int counter;
 
     for(counter = 7; counter <= 16; counter++){
        switch(counter % 10){
        
        case 0: System.out.print(“,”);
                break;
        case 1: System.out.print(“OFTEN”);
                break;
        case 2: System.out.print(“IS “);    
                break;
        case 3: System.out.print(“NOT “);
                break;
        case 4: case 9: System.out.print(“DONE “);
                break;
        case 5: System.out.print(“WELL “);
                break;
        case 6: System.out.print(“.”);
                break;
        case 7: System.out.print(“WHAT “);
                break;
        default: System.out.print(“Bad number. “);
        }
        System.out.println();
     }
}
