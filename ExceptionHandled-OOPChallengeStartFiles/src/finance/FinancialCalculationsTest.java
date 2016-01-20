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
   //Exhibit C-1 Test Vector 
   // Test Case 1 
   System.out.println("Exhibit C-1 Test Vector");
   System.out.println("Test Case 1");
   LoanPayment testcase1 = new LoanPayment(350000, 0, 10, CompoundingOption.ANNUAL, 15); 
   testcase1.getValue(); 
        System.out.println(testcase1.generateReport());
        System.out.println("============================");
   //Test Case 2 
   System.out.println("Test Case 2");
   LoanPayment testcase2 = new LoanPayment(350000, 50000, 10, CompoundingOption.ANNUAL, 15);
   testcase2.getValue();
        System.out.println(testcase2.generateReport());
        System.out.println("============================");
    
    //Test Case 3 
    System.out.println("Test Case 3");
   LoanPayment testcase3 = new LoanPayment(350000, 0, 10, CompoundingOption.SEMIANNUAL, 15);
   testcase3.getValue();
        System.out.println(testcase3.generateReport());
        System.out.println("============================");
        
    //Test Case 4
    System.out.println("Test Case 4");
   LoanPayment testcase4 = new LoanPayment(350000, 0, 10, CompoundingOption.QUARTERLY, 15);
   testcase4.getValue();
        System.out.println(testcase4.generateReport());
        System.out.println("============================");
        
    //Test Case 5
    System.out.println("Test Case 5");
   LoanPayment testcase5 = new LoanPayment(350000, 0, 10, CompoundingOption.MONTHLY, 15);
   testcase5.getValue();
        System.out.println(testcase5.generateReport());
        System.out.println("============================");
        
    //Test Case 6
    System.out.println("Test Case 6");
   LoanPayment testcase6 = new LoanPayment(350000, 0, 10, CompoundingOption.WEEKLY, 15);
   testcase6.getValue();
        System.out.println(testcase6.generateReport());
        System.out.println("============================");
    
    //====================================================================================================  
        System.out.println("\n" + "\n" + "\n");
   //Exhibit C-2 Test Vector 
    System.out.println("Exhibit C-2 Test Vector");
    
    //Test Case 1 
    System.out.println("Test Case 1");
    LoanPayment testcase1B = new LoanPayment(350000, 50000, 10, CompoundingOption.ANNUAL, 15); 
    testcase1B.getValue();
        System.out.println(testcase1B.generateReport());
        System.out.println("============================");
    
    //Test Case 2
    System.out.println("Test Case 2");
    LoanPayment testcase2B = new LoanPayment(350000, 50000, 10, CompoundingOption.MONTHLY, 15); 
    testcase1B.getValue();
        System.out.println(testcase2B.generateReport());
        System.out.println("============================");
        
     //====================================================================================================      
        System.out.println("\n" + "\n" + "\n");
    //Exhibit C-3 Test Vector 
    System.out.println("Exhibit C-3 Test Vector");
    System.out.println("Test Case 1");
    Investment testcaseI1 = new Investment(0, 100, 10, CompoundingOption.ANNUAL, 20); 
    testcaseI1.getValue(); 
        System.out.println(testcaseI1.generateReport());
        System.out.println("============================");
    
        System.out.println("Test Case 2");
    Investment testcaseI2 = new Investment(100, 100, 10, CompoundingOption.ANNUAL, 20); 
    testcaseI2.getValue(); 
        System.out.println(testcaseI2.generateReport());
        System.out.println("============================");
    
    System.out.println("Test Case 3");
    Investment testcaseI3 = new Investment(0, 100, 10, CompoundingOption.SEMIANNUAL, 20); 
    testcaseI3.getValue(); 
        System.out.println(testcaseI3.generateReport());
        System.out.println("============================");
    
    System.out.println("Test Case 4");
    Investment testcaseI4 = new Investment(0, 100, 10, CompoundingOption.QUARTERLY, 20); 
    testcaseI4.getValue(); 
        System.out.println(testcaseI4.generateReport());
        System.out.println("============================");
    
    System.out.println("Test Case 5");    
    Investment testcaseI5 = new Investment(0, 100, 10, CompoundingOption.MONTHLY, 20); 
    testcaseI5.getValue(); 
        System.out.println(testcaseI5.generateReport());
        System.out.println("============================");
    
    System.out.println("Test Case 6");
    Investment testcaseI6 = new Investment(0, 100, 10, CompoundingOption.WEEKLY, 20); 
    testcaseI6.getValue(); 
        System.out.println(testcaseI6.generateReport());
        System.out.println("============================");
    
    //=========================================================================================================
        System.out.println("\n" + "\n" + "\n");
    //Exhibit C-4 Test Vector 
    //Test Case 1
    System.out.println("Exhibit C-4 Test Vector");
    System.out.println("Test Case 1");
    Investment testcase1D = new Investment(100, 100, 10, CompoundingOption.ANNUAL, 20); 
    testcaseI1.getValue(); 
        System.out.println(testcase1D.generateReport());
        System.out.println("============================");
    //Test Case 2    
    System.out.println("Test Case 2");
    Investment testcase2D = new Investment(100, 100, 10, CompoundingOption.MONTHLY, 20); 
    testcaseI1.getValue(); 
        System.out.println(testcase2D.generateReport());
        System.out.println("============================");
    }  
}
