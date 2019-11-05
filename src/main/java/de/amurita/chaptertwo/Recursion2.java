/**
 * Thirty-Seventh Java example program.
 *
 * @version 1.0 23 July, 2019
 * @author Amurita
 */

package de.amurita.chaptertwo;

// Class for showing .
public class Recursion2 {

    // Recursion via an small example.
    public static void main(String[] args) {
        // Call the method for recursion.
        int i = 4;
        System.out.println();
        System.out.println("Starting First recursion");
        System.out.println("========================");
        down1(i);
        System.out.println();
        System.out.println();
        System.out.println("Starting Second recursion");
        System.out.println("========================");
        down2(i);
        System.out.println();
    }

    // Example for an end recursion.
    static void down1( int n ) {
        if ( n <= 0 ) // End of recursion.
            return;
        System.out.print( n + ", " );
        down1( n - 1 );
    }


    // .
    static void down2( int n ) {
        if ( n <= 0 ) // End of recursion.
            return;
        System.out.println("Value of n variable before recursion: " + n);
        down2( n - 1 );
        System.out.println("Value of n variable after recursion: " + n);
        System.out.println( n + ", " );
    }
}