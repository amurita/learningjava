/**
 * First Java example program.
 * @version 1.0 15th of February, 2018
 * @author Amurita
 */

package org.amurita.chapterone;

// Class to square different Integer values.
public class Squared {

    // Build the square of given Integer value.
    static int squared(int n) {
        return n * n;
    }

    // Output of the squared Integer values from 1 - 4.
    static void output(int n) {
        for (int i = 1; i <= n; i = i + 1) {
            String s = "Squared(" + i + ") = " + squared(i);
            System.out.println(s);
        }
    }
    public static void main( String[] args ) {
        output( 4 );
    }
}
