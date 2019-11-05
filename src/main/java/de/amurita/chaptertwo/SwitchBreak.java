/**
 * Thirty-First Java example program.
 *
 * @version 1.0 11th of July, 2019
 * @author Amurita
 */

package de.amurita.chaptertwo;

// Class for showing how a break in a switch statement could be used.
public class SwitchBreak {

    // For-Loop and Switch-Statement combined with break.
    public static void main ( String [] args ) {
        String dnaBases = "CGCAGTTCTTCGGXAC";
        int a = 0, g = 0, c = 0, t = 0;
        loop:
        for ( int i = 0; i < dnaBases.length(); i++ ) {
            switch ( dnaBases.charAt( i ) ) {
                case 'A': case 'a':
                    a++;
                    break;
                case 'G': case 'g':
                    g++;
                    break;
                case 'C': case 'c':
                    c++;
                    break;
                case 'T': case 't':
                    t++;
                    break;
                default:
                    System.err.println( "Unknown Nucleobases " + dnaBases.charAt( i ) );
                    break loop;
            }
        }
        System.out.printf( "Quantity: A=%d, G=%d, C=%d, T=%d%n", a, g, c, t );
    }
}