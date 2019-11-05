/**
 * Thirty-Sixth Java example program.
 *
 * @version 1.0 23 July, 2019
 * @author Amurita
 */

package de.amurita.chaptertwo;

// Class for showing an recursion with an abortion.
public class Recursion {

    // Recursion via an small example.
    public static void main(String[] args) {
        // Call the method for recursion.
        int i = 4;
        down(i);
    }

    // Recursion via a method and an abortion of the recursion (small recursion).
    static void down( int n ) {
        if ( n <= 0 ) // End of recursion.
            return;
        System.out.print( n + ", " );
        down( n - 1 );
    }
}