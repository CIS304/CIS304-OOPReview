/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finance;

import finance.enums.CompoundingOption;

/**
 *
 * @author kevin
 */
public class FinancialCalculationsTest {
  
    public static void main(String[] args) {
   // Test Case 1 
   LoanPayment testcase1 = new LoanPayment(350000, 0, 0.10, CompoundingOption.ANNUAL, 15); 
   testcase1.getValue(); 
   System.out.println(testcase1.generateReport());
        
    }

}
