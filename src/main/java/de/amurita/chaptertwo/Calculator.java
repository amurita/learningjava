/**
 * Nineteenth Java example program.
 *
 * @version 1.0 8th of July, 2019
 * @author Amurita
 */

package de.amurita.chaptertwo;

// Class for realizing the four basic arithmetic operations.
public class Calculator {

    // Get two doubles and one of the four basic arithmetic operations.
    public static void main ( String [] args ) {
        System.out.println("Please write your first number of the calculation: ");
        double x = new java.util.Scanner( System.in ).nextDouble();

        System.out.println("Please write the operator symbol for your desired basic arithmetic operation: ");
        char operator = new java.util.Scanner( System.in ).nextLine().charAt( 0 );

        System.out.println("Please write your second number of the calculation: ");
        double y = new java.util.Scanner( System.in ).nextDouble();
        switch ( operator ) {
            case '+':
                System.out.println( x + y );
                break;
            case '-':
                System.out.println( x - y );
                break;
            case '*':
                System.out.println( x * y );
                break;
            case '/':
                System.out.println( x / y );
                break;
            default:
                System.err.println( "Unknown Operator " + operator );

        }
    }
}