/**
 * Twentieth Java example program.
 *
 * @version 1.0 8th of July, 2019
 * @author Amurita
 */

package de.amurita.chaptertwo;

// Class for calculating the amount of days for the given month.
public class DaysOfMonth {

    // Calculate the amount of the days per month.
    public static void main ( String [] args ) {
        int month = new java.util.Scanner( System.in ).nextInt();

        int year = new java.util.Scanner( System.in ).nextInt();
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0); // LeapYear or not?
        switch ( month ) {
            case 4: // Fall-through
            case 6:
            case 9:
            case 11:
                System.out.println( "30 days" );
                break;
            case 1: // Fall-through
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println( "31 days" );
                break;
            case 2:
                if ( isLeapYear )
                    System.out.println( "29 days" );
                else
                    System.out.println( "28 days" );
                break;
            default:
                System.err.println( "Invalid month!" );
        }
    }
}