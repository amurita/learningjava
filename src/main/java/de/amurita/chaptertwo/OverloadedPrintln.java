/**
 * Second Java example program.
 * @version 1.0 16th of February, 2018
 * @author Amurita
 */

package de.amurita.chaptertwo;

// Class to show overloading a method.
public class OverloadedPrintln {

    // Show different overloaded println variants.
    public static void main( String[] args ) {
        System.out.println( "Verhaften Sie die üblichen Verdächtigen!" ); // Print String
        System.out.println( true ); // Print boolean value
        System.out.println( -273 ); // Print negative integer
        System.out.println(); // Print blank line
        System.out.println( 1.6180339887498948 ); // Print floatingpoint value
        System.out.println( (1 + 2) * 1.19 ); // Print expression
    }
}