/**
 * Fourteenth Java example program.
 *
 * @version 1.0 5th of July, 2019
 * @author Amurita
 */

package de.amurita.chaptertwo;

// Class to show that there exists no general computation from primitive to rerference types
public class TypecastPrimRef {

    // Different typecasts, primitive -> rerfence types, and its outcome
    public static void main ( String [] args ) {
        //String s = (String) 1; //  Cannot cast from int to String
        //int i = (int) "1"; //  Cannot cast from String to int

        Long lông = (Long) 2L; // Alternativ: Long lông = 2L;
        System.out.println( (Boolean) true );
        ((Integer)2).toString();
        System.out.println(((Integer)2)); // TODO: Why is this expression (((Integer)2)) a String?
    }
}