// ***************************************************************
//   Salary.java
//
//   Computes the amount of a raise and the new
//   salary for an employee.  The current salary
//   and a performance rating (a String: "Excellent",
//   "Good" or "Poor") are input.
// ***************************************************************
 
import java.util.Scanner;
import java.text.NumberFormat;
 
public class CreditCard
{
   public static void main (String[] args)
   {
           double previousBalance;          // new salary for the employee
           double newBalance;
           double interest = 0.02;
           double charges = 0;
           double minimum;
           // performance rating
 
           Scanner scan = new Scanner(System.in);
 
           System.out.print ("Enter the previous balance: ");
           previousBalance = scan.nextDouble();
           System.out.print ("Enter the amount of charges: ");
           charges = scan.nextDouble();
           interest = charges * 0.02; 
           
        if(previousBalance < 50){
               minimum = previousBalance;
            }
           if(previousBalance >= 50 && previousBalance <= 300) {
               minimum = 50;
        }
        if(previousBalance > 300) {
            minimum = previousBalance * 0.2;        
        }
        
        
        
        newBalance = previousBalance + charges + interest;
 
           // Print the results
           NumberFormat money = NumberFormat.getCurrencyInstance();
           System.out.println();
           System.out.println("previous balance:           " + money.format(previousBalance));
           System.out.println("Amount of charges:          " + money.format(charges));
           System.out.println("Amount ofinterest:          " + money.format(interest));
           System.out.println("Your new balance is:        " + money.format(newBalance));
           System.out.println();
        }
}