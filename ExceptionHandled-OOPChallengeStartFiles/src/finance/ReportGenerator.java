package finance;

import java.text.NumberFormat;

/**
 * Interface for generating summary reports for financial calculations.
 * @author JAM
 * @version 150107
 */
public interface ReportGenerator {
    
    /**
     * Generates a summary report for a selected financial calculation.
     * @return text summary report of the financial calculation
     */
    public String generateReport ();
    
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
    NumberFormat percentFormat = NumberFormat.getPercentInstance();
    
    String summary = "Loan Payment Summary\n";
           summary += "Purchase Amount: " + currencyFormat.format() + "\n";
           summary += "Down Payment: " + currencyFormat.format() + "\n";
           summary += "Amount Financed: " + currencyFormat.format() + "\n";
           summary += "APR: " + percentFormat.format() + "\n";
           summary += "Compounding: " +  + "\n";
           summary += "Loan Duration (years): " +  + "\n";
           summary += "Payment (monthly): " + currencyFormat.format() + "\n";
           
           
           
}


