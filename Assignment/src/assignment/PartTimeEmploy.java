
package assignment;

/**
 *
 * @author hcc
 */
public class PartTimeEmploy extends Employ {
    
    private double salaryRate ; 
    
    
    public void setSalaryRate( double workingHour)
    {
        salaryRate=  workingHour*8;
    }
    
    public double getSalaryRate()
    {
        return salaryRate ; 
    }
    
    
    
    
    
    
}
