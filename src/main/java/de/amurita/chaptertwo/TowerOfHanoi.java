/**
 * Thirty-Eight Java example program.
 *
 * @version 1.0 29 July, 2019
 * @author Amurita
 */

package de.amurita.chaptertwo;

// Class for showing one solution of the Tower of Hanoi problem.
public class TowerOfHanoi {

    // Recursion for Tower of Hanoi solution.
    static void move( int n, String fromPeg, String toPeg, String usingPeg ) {
        if ( n > 1 ) {
            move( n - 1, fromPeg, usingPeg, toPeg );
            System.out.printf( "Move disc %d from %s to %s.%n", n, fromPeg, toPeg );
            move( n - 1, usingPeg, toPeg, fromPeg );
        }
        else
            System.out.printf( "Move disc %d from %s to %s.%n", n, fromPeg, toPeg );
    }

    // Main method
    public static void main( String[] args ) {
        move( 4, "Cooper-Pillar", "Gold-Pillar", "Silver-Pillar" );
    }
}