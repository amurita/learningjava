/**
 * Thirteenth Java example program.
 *
 * @version 1.0 5th of July, 2019
 * @author Amurita
 */

package de.amurita.chaptertwo;

// Class to show automatic typecasts during computation with byte and short in int
public class AutoConvert {

    // Print different typecast operations
    public static void main ( String [] args ) {
        // Following typecasts are working automatically.
        int int1 = 1, int2 = 2;
        int int3 = int1 + int2;
        long long1 = 1, long2 = 2;
        long long3 = long1 + long2;

        short short1 = 1, short2 = 2;
        byte byte1 = 1, byte2 = 2;

        // The following code produces some compiler errors
        //short short3 = short1 + short2; // Type mismatch: cannot convert from int to short
        //byte byte3 = byte1 + byte2;     // Type mismatch: cannot convert from int to byte

        // The right version for before mentioned additions (shorts and bytes)
        short short3 = (short)( short1 + short2 );
        byte byte3 = (byte)( byte1 + byte2 );
    }
}