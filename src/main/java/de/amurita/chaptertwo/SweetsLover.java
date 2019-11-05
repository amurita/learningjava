/**
 * Twenty-First Java example program.
 *
 * @version 1.0 8th of July, 2019
 * @author Amurita
 */

package de.amurita.chaptertwo;

// Class for .
public class SweetsLover {

    // .
    public static void main ( String [] args ) {
        String input = javax.swing.JOptionPane.showInputDialog( "Input" );
        switch ( input.toLowerCase() ) {
            case "kekse":
                System.out.println( "I love cookies!" );
                break;
            case "kuchen":
                System.out.println( "I love cakes" );
                break;
            case "schokolade": // Fällt durch
            case "lakritze":
                System.out.println( "Hm. Delicious!" );
                break;
            default:
                System.out.printf( "Can you eat %s ?%n", input );
        }
    }
}