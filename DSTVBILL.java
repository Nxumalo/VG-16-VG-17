// DSTV Company Billing 

import java.util.*;

public class DSTVBILL{
    
   static Scanner console = new Scanner(System.in);

   // Named constants - residential customers 
  
   static final double R_BILL_PROC_FEE = 4.50;
   static final double R_BASIC_SERV_COST = 20.50;
   static final double R_COST_PREM_CHANNEL = 7.50;

   // Named constants - business customers 

   static final double B_BILL_PROC_FEE = 15.50;
   static final double B_BASIC_SERV_COST = 75.50;
   static final double B_BASIC_CONN_COST = 5.00;
   static final double B_COST_PREM_CHANNEL = 50.50;

   public static void main (String [] args){

      // Variable declaration 

      int accountNumber;
      char customerType;
      int numberOfPremuimChannels;
      int numberOfBasicServiceConnections;
      double amountDue;

      System.out.println(“This Program computes DSTV monthly payment bills.”);

      System.out.print(“Enter the account number: “);
      accountNumber = console.nextInt();
      System.out.println();

      System.out.print(“Enter the customer type: R or r (Residential), B or b (Business) : “);
      customerType = console.next().charAt(0);
      System.out.println()

      switch(customerType){

      case ‘r’:
      case ‘R’: System.out.print(“Enter the number of premium channels: “);
                numberOfPremuimChannels = console.nextInt();
      System.out.println();

      amountDue = R_BILL_PROC_FEE +
                  R_BASIC_SERV_COST +
                  numberOfPremuimChannels *
                  R_COST_PREM_CHANNEL;
  
      System.out.println(“Account number = “ + accountNumber);
      System.out.printf(“Amount due = $%.2f %n”,amountDue);
             break;
      case ‘b’:
      case ‘B’: System.out.print(“Enter the number of basic service connection: “);
                numberOfBasicServiceConnections = console.nextInt();
                System.out.println();
                System.out.print(“Enter the number of premium channels: “);
                numberOfPremuimChannels = console.nextInt();
                System.out.println();

                if (numberOfBasicServiceConnections <= 10)
                   amountDue = B_BILL_PROC_FEE +
                               B_BASIC_SERV_COST +
                               numberOfPremiumChannels *
                               B_COST_PREM_CHANNEL;
                else
                   amountDue = B_BILL_PROC_FEE +
                               B_BASIC_SERV_COST +
                               (numberOfBasicServiceConnections - 10)
                               * B_BASIC_CONN_COST +
                               numberOfPremiumChannels *
                               B_COST_PREM_CHANNEL;
                System.out.println(“Account number = “ + accountNumber);
                System.out.printf(“Amount due = $%.2f %n”, amountDue);
                break;

      default: System.out.println(“Invalid customer type. “);
    } // end switch 
  }
}


