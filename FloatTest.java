
package floattest;

import java.util.Scanner;

public class FloatTest {

    public static void main(String[] args) {
        
    Scanner scnr = new Scanner(System.in);
    //Change "double" to floats to allow for user input with decimals
    float afterTaxPaycheck    = 0;
    float annualSalary        = 0;
    float monthlySalary       = 0;
    float biWeeklySalary      = 0;
    float hourlyWage          = 0;
    float hoursPerWeek        = 0;
    
    System.out.println("Enter your bi-weekly paycheck after taxes: ");
        afterTaxPaycheck = scnr.nextFloat();
        
    monthlySalary = afterTaxPaycheck * 2;
    annualSalary  = monthlySalary * 12;
    // assigning var afterTaxPaycheck to var biWeekly for better readability.
    biWeeklySalary = afterTaxPaycheck; 
    
    System.out.println("Enter Average Hours Worked Per Week: ");
        hoursPerWeek = scnr.nextFloat();
    
    hourlyWage = biWeeklySalary / (hoursPerWeek * 2);
    //how do we get decimals to stop at the hundredth position?
    System.out.println("Your Approximate Hourly Wage After Taxes is: " + "$" + hourlyWage + "/hr");
        
    System.out.println("Your Approximate Take Home Monthly Salary After Taxes is: " + "$" + monthlySalary + "/mo");
    
    System.out.println("Your Approximate Take Home Annual Salary After Taxes is: " + "$" + annualSalary + "/yr");
    
            
    }
    
}

    }
    
}
