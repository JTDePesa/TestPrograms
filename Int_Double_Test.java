package int_double_test;

import java.util.Scanner;

public class Int_Double_Test {

    public static void main(String[] args) {
        
    Scanner scnr = new Scanner(System.in);
    //Change "double" to floats to allow for user input with decimals
    double afterTaxPaycheck    = 0;
    double annualSalary        = 0;
    double monthlySalary       = 0;
    double biWeeklySalary      = 0;
    double hourlyWage          = 0;
    double hoursPerWeek        = 0;
    
    System.out.println("Enter your bi-weekly paycheck after taxes: ");
        afterTaxPaycheck = scnr.nextDouble();
        
    monthlySalary = afterTaxPaycheck * 2;
    annualSalary  = monthlySalary * 12;
    // assigning var afterTaxPaycheck to var biWeekly for better readability.
    biWeeklySalary = afterTaxPaycheck; 
    
    System.out.println("Enter Average Hours Worked Per Week: ");
        hoursPerWeek = scnr.nextDouble();
    
    hourlyWage = biWeeklySalary / (hoursPerWeek * 2);
    
    System.out.println("Your Approximate Hourly Wage After Taxes is: " + "$" + hourlyWage + "/hr");
        
    System.out.println("Your Approximate Take Home Monthly Salary After Taxes is: " + "$" + monthlySalary + "/mo");
    
    System.out.println("Your Approximate Take Home Annual Salary After Taxes is: " + "$" + annualSalary + "/yr");
    
            
    }
    
}
