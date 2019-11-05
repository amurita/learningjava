/**
 * Thirty-Third Java example program.
 *
 * @version 1.0 19th of July, 2019
 * @author Amurita
 */

package de.amurita.chaptertwo;

// Class for calculating for a given value the square root.
public class PrintSqrt {

    // Calculating the square root.
    static void printSqrt( double d ) {
        if ( d < 0 ) {
            System.out.println( "No square root of negative numbers!" );
            return;
        }
        System.out.printf( "Square root of %f : %4f", d, Math.sqrt( d ) );
    }

    public static void main( String[] args ) {
        System.out.println("Please write a double number: ");
        double ownDoubleValue = new java.util.Scanner( System.in ).nextDouble();
        System.out.println();
        printSqrt(ownDoubleValue);
    }
}