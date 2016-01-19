import finance.*;
import finance.enums.CompoundingOption;
import java.util.*;
import java.io.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juliebeth
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double purchaseAmmount;
        double downPayment;
        double interestRate;
        CompoundingOption compoundingOptions;
        double loanDuration;
        boolean exit = false;
        String ans;
        Scanner reader = new Scanner(System.in);
        
        while (!exit) {
            System.out.print("Please enter the purcahse amount: ");
            purchaseAmmount = reader.nextDouble();
            
            System.out.print ("Please enter the down payment: ");
            downPayment = reader.nextDouble ();
            
            System.out.print ("Please enter the interest rate: ");
            interestRate = reader.nextDouble ();
            
            reader.nextLine();
            System.out.print ("Please enter the compounding: ");
            ans = reader.nextLine();
            
            if (ans.equals("annual"))
                compoundingOptions = CompoundingOption.ANNUAL;
            else if (ans.equals ("semiannual"))
                compoundingOptions = CompoundingOption.SEMIANNUAL;
            else if (ans.equals("quarterly"))
                compoundingOptions = CompoundingOption.QUARTERLY;
            else if (ans.equals("monthly"))
                compoundingOptions = CompoundingOption.MONTHLY;
            else  
                compoundingOptions = CompoundingOption.WEEKLY;
            
            
            
            
            System.out.print ("Please enter the loan duration: ");
            loanDuration = reader.nextDouble ();
            
            System.out.print("Do you want anohter loan (yes/y or no/n)?: ");
            ans = reader.nextLine();
            
            LoanPayment lp = new LoanPayment(purchaseAmmount, downPayment, interestRate, compoundingOptions , loanDuration);
            Investment i = new Investment(interestRate, downPayment, interestRate, compoundingOptions, interestRate)
            
            if (ans.toLowerCase().equals(("no")) || ans.toLowerCase().equals("y"))
                exit = true;
        }
            
        
        //LoanPayment x = new LoanPayment(0, 0, 0, CompoundingOption.MONTHLY, 0);
    }
    
}
