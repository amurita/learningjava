/**
 * Sixteenth Java example program.
 *
 * @version 1.0 5th of July, 2019
 * @author Amurita
 */

package de.amurita.chaptertwo;

// Class for guessing a number (random) and check whether the user input is equal to the guessed number.
public class WhatsYourNumber {

    // Get random number and check against the user input.
    public static void main ( String [] args ) {
        int number = (int) (Math.random() * 5 + 1);
        System.out.printf("My choosen number is: %d %n", number);
        System.out.println( "Guess my choosen number of between 1 and 5?" );
        int guess = new java.util.Scanner( System.in ).nextInt();
        if ( number == guess ) {
            System.out.println( "Good guess!" );
        }
        System.out.println( "Try it another time and start the programm again!!" );
    }
}