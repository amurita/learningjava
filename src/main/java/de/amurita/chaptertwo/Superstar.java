/**
 * Twenty-Sixth Java example program.
 *
 * @version 1.0 11th of July, 2019
 * @author Amurita
 */

package de.amurita.chaptertwo;

// Class to show the functionality of nested for-loops.
public class Superstar {

    // Two nested for-loops.
    public static void main ( String [] args ) {
        for ( int i = 1; i <= 5; i++ ) { // Counter from 1 to 5
            for ( int j = 1; j <= i; j++ ) // A second counter from 1 to j <= i.
                System.out.print( '*' );
            System.out.println();
        }
    }
}