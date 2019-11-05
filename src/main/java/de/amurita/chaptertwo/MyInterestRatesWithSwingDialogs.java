/**
 * Tenth Java example program (Swing version).
 * @version 1.0 26th of February, 2018
 * @author Amurita
 */
package de.amurita.chaptertwo;

// Class to calculate interest rates (advanced version).
public class MyInterestRatesWithSwingDialogs {

    // Calculate interest rates on user input.
    public static void main( String[] args ) {
        double capital;
        capital = Double.parseDouble(javax.swing.JOptionPane.showInputDialog(
                "Capital as double value (Euros)" ));
        double interestRate;
        interestRate = Double.parseDouble(javax.swing.JOptionPane.showInputDialog(
                "Interest rate as double value" ));
        int investmentPeriodInMonth;
        investmentPeriodInMonth = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(
                "Investment period in month as int value" ));
        double totalInterestRate = capital * interestRate * investmentPeriodInMonth / (12*100);
        javax.swing.JOptionPane.showMessageDialog(
                null, String.format("Total interest rate: €%.2f",  totalInterestRate));
    }

}
