/**
 * Twenty-Fourth Java example program.
 *
 * @version 1.0 10th of July, 2019
 * @author Amurita
 */

package de.amurita.chaptertwo;

// Class to show the functionality of a do-while-loop.
public class TheFinalGuess {

    // Show the functionality of a do-while-loop via a final guess example
    public static void main ( String [] args ) {
        int number = (int) (Math.random() * 5 + 1);
        int guess;
        do {
            System.out.println( "Guess my choosen number of between 1 and 5?" );
            guess = new java.util.Scanner( System.in ).nextInt();
            if ( number == guess )
                System.out.println( "Good guess!" );
            else if ( number > guess )
                System.out.println( "My number is greater than your choosen one!" );
            else // number < guess
                System.out.println( "My number is smaller than your choosen one!" );
        }
        while ( number != guess );
    }
}