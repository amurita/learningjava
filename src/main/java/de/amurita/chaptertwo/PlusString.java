/**
 * Fifteenth Java example program.
 *
 * @version 1.0 5th of July, 2019
 * @author Amurita
 */

package de.amurita.chaptertwo;

// Class to show the plus sign overloading for String object additions
public class PlusString {

    // Print different versions of String/no String plus handling
    public static void main ( String [] args ) {
        System.out.println( 1 + 2 ); // 3
        System.out.println( "1" + 2 + 3 ); // 123
        System.out.println( 1 + 2 + "3" ); // 33
        System.out.println( 1 + 2 + "3" + 4 + 5 ); // 3345
        System.out.println( 1 + 2 + "3" + (4 + 5) ); // 339

        System.out.println( '0' + 2 ); // 50 - ASCII value of '0' is 48
        System.out.println( 'A' + 'a' ); // 162 - 'A'=65, 'a'=97
    }
}