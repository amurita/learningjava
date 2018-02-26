/**
 * Ninth Java example program.
 * @version 1.0 26th of February, 2018
 * @author Amurita
 */
package org.amurita.chaptertwo;

// Class to calculate interest rates (advanced version).
public class MyInterestRates {

    // Calculate interest rates on user input.
    public static void main( String[] args ) {
        System.out.println( "Capital?" );
        double capital = new java.util.Scanner( System.in ).nextDouble(); //
        System.out.println( "Interest rate?" );
        double interestRate = new java.util.Scanner( System.in ).nextDouble();
        System.out.println( "Investment period in month?" );
        int investmentPeriodInMonth = new java.util.Scanner( System.in ).nextInt();
        double totalInterestRate = capital * interestRate * investmentPeriodInMonth / (12*100);
        System.out.printf( "Total interest rate: %g%n", totalInterestRate );
    }

}
