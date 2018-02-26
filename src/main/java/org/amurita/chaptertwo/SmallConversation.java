/**
 * Eighth Java example program.
 * @version 1.0 26th of February, 2018
 * @author Amurita
 */

package org.amurita.chaptertwo;

// Class for small conversations.
public class SmallConversation {

    // Method for console input.
    public static void main( String[] args ) {
        System.out.println( "Morning! What's your name?" );
        String name = new java.util.Scanner( System.in ).nextLine(); // Read string.
        System.out.printf( "Hi %s. How old are you?%n", name );
        int age = new java.util.Scanner( System.in ).nextInt(); // Read integer.
        System.out.printf( "Understand, %s years old, that's the middle of %s.%n",
                age, age * 2 );
        System.out.println( "What's your current favourite floating-point number?" );
        double value = new java.util.Scanner( System.in ).nextDouble(); // Read double.
        System.out.printf( "%s? Ok, my favourite one is %s.%n",
                value, Math.random() * 100000 ); // Random output.
    }
}
