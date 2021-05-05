//**************************************************************************************************************************************************************
// Program: Check Account Balance
// This program  calculates a customers checking balance 
// balance at the end of the month 
//**************************************************************************************************************************************************************

import java.util.*;
import java.io.*;

public class CheckAccountBalance{

   static final double MINIMUM_BALANCE = 100000.00;
   static final double SERVICE_CHARGE = 250.00;

   public static void main (String [] args) throw FileNotFoundException {

       // Declare and Intialize the variables 
     
       int acctNumber;
       double beginBalance;
       double accountBalance;
       
       double amountDeposited = 0.0;
       int numberOfDeposits = 0;
       
       double amountWithdrawn = 0.0;
       int numberOfWithdrawals = 0;

       double interestPaid = 0.0;
       
       char transactionCode;
       double transactionAmount;
   
       boolean isServiceCharged = false;

       Scanner inFile = new Scanner (new FileReader(“a:\\money.txt”);

       PrintWriter outFile = new PrintWriter(“a:\\money.out”);

       acctNumber = inFile.nextInt();
       beginBalance = inFile.nextDouble();

       accountBalance = beginBalance;

       while(inFile.hasNext()){
            
            transactionCode = inFile.next().charAt(0);
            transactionAmount = inFile.nextDouble();

            switch(transactionCode){

                  case ‘D’:
                  case ‘d’: accountBalance = accountBalance + transactionAmount;
                            amountDeposited = amountDeposited + transactionAmount;
                            numberOfDeposits++; 
                            break;  
                  case ‘I’: 
                  case ‘i’: accountBalance = accountBalance + transactionAmount;
                            interestPaid = interestPaid + transactionAmount;
                            break;
                  case ‘W’:
                  case ‘w’: accountBalance = accountBalance - transactionAmount;
                            amountWithdrawn = amountWithdrawn + transactionAmount;
                            numberOfWithdrawals++;

                            if((accountBalance < MINIMUM_BALANCE) && (!isServiceCharged)){
                               accountBalance = accountBalance - SERVICE_CHARGE;
                               isServiceCharged = true;
                              }
                            break;
           default: System.out.println(“Invalid transaction code.”);
      } // end switch 
   } //end while 

            // Output results
       outFile.printf(“Account Number: %d%n”, acctNumber);
       outFile.printf(“Beginning Balance: $%.2f %n”, beginBalance);
       outFile.printf(“Ending Balance: %.2f %n”,accountBalance);
       outFile.println();
       outFile.printf(“Interest Paid: $%.2f %n”,interestPaid);
       outFile.println();
       outFile.printf(“Amount Deposited: $%.2f %n”, amountDeposited);
       outFile.printf(“Number of Deposits: %d%n”,numberOfDeposits);
       outFile.println();
       outFile.printf(“Amount Withdrawn: $%.2f %n”,amountWithdrawn);
       outFile.printf(“Number of Withdrawals: %d%n”,numberOfWithdrawals);
       outFile.println();

       if(isServiceCharged){
          outFile.printf(“Service Charge: $%.2f %n”, SERVICE_CHARGE);
      outFile.close();
      }  
}







