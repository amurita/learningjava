/**
 * Thirty-Ninth Java example program.
 *
 * @version 1.0 30 July, 2019
 * @author Amurita
 */

package de.amurita.chapterthree;

// Class for showing an example how to use the point class.
public class PlayerAndDoorAsPoints {

    // Create two points, one for the player, one for the door and calculate the distance.
    public static void main( String[] args ) {
        java.awt.Point player = new java.awt.Point();
        player.x = player.y = 10;
        java.awt.Point door = new java.awt.Point();
        door.setLocation( 10, 100 );
        System.out.println( player.distance( door ) ); // 90.0
    }
}