/**
 * Seventeenth Java example program.
 *
 * @version 1.0 6th of July, 2019
 * @author Amurita
 */

package de.amurita.chaptertwo;

// Class for guessing a number (random) and check whether the user input is equal to the guessed number.
public class GuessTheNumber {

    // Get random number and check against the user input.
    public static void main ( String [] args ) {
        int number = (int) (Math.random() * 5 + 1);
        System.out.println( "Guess my choosen number of between 1 and 5?" );
        int guess = new java.util.Scanner( System.in ).nextInt();
        if ( number == guess )
            System.out.println( "Good guess!" );
        else
            System.out.printf( "What a pity, wrong number. My choosen number is: %s!", number );
    }
}