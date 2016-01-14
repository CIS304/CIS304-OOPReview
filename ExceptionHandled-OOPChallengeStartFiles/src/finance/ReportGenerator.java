package finance;

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
    
}


