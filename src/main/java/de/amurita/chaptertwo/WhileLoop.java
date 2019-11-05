/**
 * Twenty-Second Java example program.
 *
 * @version 1.0 10th of July, 2019
 * @author Amurita
 */

package de.amurita.chaptertwo;

// Class to show the functionality of a while-loop.
public class WhileLoop {

    // Counting down, in steps of 10, from 100 to 40.
    public static void main ( String [] args ) {
        int cnt = 100; // Counter initial value.
        while ( cnt >= 40 ) {
            System.out.printf( "I saw the light of the day " +
                    "in the form of %d-watt incandescent bulb.%n", cnt );
            cnt -= 10;
        }
    }
}