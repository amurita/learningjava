/**
 * Eleventh Java example program.
 *
 * @version 1.0 6th of June, 2019
 * @author Amurita
 */

package de.amurita.chaptertwo;

// Class to show differences between Remainder and Division
public class RemainderAndDivDemo {

    // Print different Remainder and Division results
    public static void main ( String [] args ) {
        System.out.println( "+5% +3 = " + (+5% +3) ); // 2
        System.out.println( "+5 / +3 = " + (+5 / +3) ); // 1
        System.out.println( "+5% -3 = " + (+5% -3) ); // 2
        System.out.println( "+5 / -3 = " + (+5 / -3) ); // -1
        System.out.println( "-5% +3 = " + (-5% +3) ); // -2
        System.out.println( "-5 / +3 = " + (-5 / +3) ); // -1
        System.out.println( "-5% -3 = " + (-5% -3) ); // -2
        System.out.println( "-5 / -3 = " + (-5 / -3) ); // 1
    }
}
