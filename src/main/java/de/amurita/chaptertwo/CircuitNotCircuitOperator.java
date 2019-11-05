/**
 * Twelfth Java example program.
 *
 * @version 1.0 3rd of July, 2019
 * @author Amurita
 */

package de.amurita.chaptertwo;

// Class to show differences between circuit and not-circuit operator
public class CircuitNotCircuitOperator {

    // Print different variants of circuit/not-circuit operations
    public static void main ( String [] args ) {
        int a = 0, b = 0, c = 0, d = 0;
        System.out.println( true || a++ == 0 ); // true, a won't be incremented
        
        System.out.println( a ); // 0
        System.out.println( true | b++ == 0 ); // true, b incremented
        System.out.println( b ); // 1
        System.out.println( false && c++ == 0 ); // false, c won't be incremented
        System.out.println( c ); // 0
        System.out.println( false & d++ == 0 ); // false, d incremented
        System.out.println( d ); // 1
    }
}
