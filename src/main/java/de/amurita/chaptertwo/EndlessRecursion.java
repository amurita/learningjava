/**
 * Thirty-Fifth Java example program.
 *
 * @version 1.0 23 July, 2019
 * @author Amurita
 */

package de.amurita.chaptertwo;

// Class for showing an endless recursion.
public class EndlessRecursion {

    // Endless recursion via an small example.
    public static void main(String[] args) {
        // Call the method for recursion.
        int i = 3;
        down(i);
    }

    // Endless recursion via a method (small recursion).
    static void down( int n ) {
        System.out.print( n + ", " );
        down( n - 1 );
    }
}