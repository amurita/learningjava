/**
 * Thirty-Second Java example program.
 *
 * @version 1.0 19th of July, 2019
 * @author Amurita
 */

package de.amurita.chaptertwo;

// Class for showing a static method without return type and any parameters.
public class FriendlyGreeter {

    // Following the mentioned static method.
    static void greet() {
        System.out.println( "Good morning! In case we do not see each other " +
                "today; good day, good evening and good night!" );
    }
    public static void main( String[] args ) {
        greet();
        // Question from page 199.
        int i = 1;
        System.out.println( Math.max( i++, --i ) );
    }
}