/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author hcc
 */
public class FullTimeEmploy extends Employ {
    
    private double  yearlySalary;
    
    
    
    public void  setYearlySalary( double monthlySalary)
    {
        yearlySalary= monthlySalary*12;
    }
    
    public double getYearlySalary()
    {
        return yearlySalary;
    }
}

