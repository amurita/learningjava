/**
 * Twenty-Eigth Java example program.
 *
 * @version 1.0 11th of July, 2019
 * @author Amurita
 */

package de.amurita.chaptertwo;

// Class for guessing a number (random) and check whether the user input is equal to the guessed number.
public class GuessRight {

    // Get random number and check against the user input.
    public static void main ( String [] args ) {
        int number = (int) (Math.random() * 5 + 1);
        while ( true ) {
            System.out.println( "Guess my choosen number of between 1 and 5?" );
            int guess = new java.util.Scanner( System.in ).nextInt();

            if ( guess < 1 || guess > 5 ) {
                System.out.println( "Only numbers between 1 and 5!" );
                continue;
            }

            if ( number == guess ) {
                System.out.println( "Good guess!" );
                break; // End of loop
            }
            else if ( number > guess )
                System.out.println( "My number is greater than your choosen one!" );
            else if ( number < guess )
                System.out.println( "My number is smaller than your choosen one!" );
        }
    }
}