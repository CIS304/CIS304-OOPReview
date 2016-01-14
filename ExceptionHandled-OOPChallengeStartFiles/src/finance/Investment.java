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
 * @author steph
 */
/** The Investment class calculates the future value of an investment after a specified number of years. 
 * It also provides a summary report of the investment parameters. 
 * This class inherits the TVMEngine class and implements the ReportGenerator interface. 
 * @author kevin
 * @version 160106 
 */

public class Investment extends TVMEngine implements ReportGenerator{




    
    /** The class constructor creates an Investment object configured to calculate future value of an investment. 
     * The parameters are provided to the object through the constructor. 
     * @param initialInvestment the amount invested at the beginning of the investment term 
     * @param periodicPayment the amount invested at regular intervals over the length of the investment 
     * @param interestRate the return on the investment. This parameter is expressed as an annual percentage rate (APR) 
     * @param compounding indicates how often interest is added to the value of the investment 
     * @param yearsInvested the length of time the investment is made in years 
     */
    
    public Investment (double initialInvestment, 
                        double periodicPayment, 
                        double interestRate, 
                        CompoundingOption compounding,
                        double yearsInvested){
        super(yearsInvested, interestRate, compounding, initialInvestment,periodicPayment,0); 
        setFV(calcFV()); 
        
    }
    
    
    /** Provides the future value of an investment as text formatted as US currency. 
     * text formatted as US currency
     * 
     * @return A String object representing the investment future value formatted as US currency rounded to two decimal places 
     **/
    
    @Override
    public String getValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /** 
     * Provides a text summary report of the investment. The report includes the initial investment amount, 
     * periodic investment amount, annual return, compounding, length of the investment in years, and the future value if the investment. 
     * @return A string object containing a summary of the investment parameters. 
     */
    @Override
    public String generateReport() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
