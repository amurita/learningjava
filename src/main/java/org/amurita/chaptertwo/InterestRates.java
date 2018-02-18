/**
 * Seventh Java example program.
 * @version 1.0 17th of February, 2018
 * @author Amurita
 */
package org.amurita.chaptertwo;

// Class to visualize interest rates.
public class InterestRates {

    // Calculate total interest rates.
    public static void main( String[] args ) {
        double capital = 20000 /* Euro */;
        double interestRate = 3.6 /* Prozent */;
        double totalInterestRate = capital * interestRate / 100; // Jahr 1
        System.out.print( "Zinsen: " );
        System.out.println( totalInterestRate ); // 720.0
    }
}