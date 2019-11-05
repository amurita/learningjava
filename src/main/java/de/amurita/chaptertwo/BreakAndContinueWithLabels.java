/**
 * Twenty-Ninth Java example program.
 *
 * @version 1.0 11th of July, 2019
 * @author Amurita
 */

package de.amurita.chaptertwo;

// Class for showing a break or continue with labels
public class BreakAndContinueWithLabels {

    // Examples of the handling of breaks/continues with labels.
    public static void main ( String [] args ) {
        heaven:
        while ( true ) {
            hell:
            while ( true )
                break /* continue */ heaven;
                //break /* continue */ hell;
                //System.out.println( "hell" );
        }
        System.out.println( "heaven" );
    }
}