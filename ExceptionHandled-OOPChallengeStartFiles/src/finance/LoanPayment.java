/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finance;

import finance.ReportGenerator;
import finance.TVMEngine;
import finance.enums.CompoundingOption;

/**
 *
 * The LoanPayment class shall provide the following capabilities:
 * Calculate the periodic payment required to pay off a loan given the amount purchased, down
 * payment, interest rate (APR), compounding, and loan duration.
 * The periodic payment shall be provided by the getValue method (required of all classes that
 * inherit TVMEngine). The periodic payment shall be produced as text formatted as US currency. Produce a text summary report of the loan as shown in the example below:
 * The summary report shall be provided by the generateReport method required by the ReportGenerator interface.
 * 
 * @author stephen b
 * @version160106
 */
public class LoanPayment extends TVMEngine implements ReportGenerator {

    /**
     * The class constructor creates a LoanPayment object configured to
     * calculate a loan payment. The loan parameters are provided to the object
     * through the constructor.
     * @param purchaseAmount the amount of the purchase to be made by the borrower
     * @param downPayment the down payment to be made by the borrower against the purchase amount
     * @param interestRate the annual percentage rate (APR) to be applied to the loan.
     * @param compounding indicates how often interest is added to the loan principal.
     * @param loanDuration the duration of the loan in years
     */
    public LoanPayment (double purchaseAmount,
                        double downPayment,
                        double interestRate,
                        CompoundingOption compounding,
                        double loanDuration) {
        
    }
    
    /** Provides the periodic payment required to pay off the amount financed. The payment is provided as
     * text formatted as US currency
     * 
     * @return A String object representing the loan payment formatted as US currency rounded to two
     * decimal places
     **/
     
    @Override
    public String getValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String generateReport() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
