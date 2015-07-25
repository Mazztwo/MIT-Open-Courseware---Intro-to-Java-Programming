/* MIT Open Courseware
 * Intro to Programming in Java
 * 
 * Assignment 6: Graphics strikes back!
 * This file is an interface for sprites.
 * 
 * Assignments can be found at the following link: 
 * http://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-092-introduction-to-programming-in-java-january-iap-2010/index.htm
 */

import java.awt.Graphics;

public interface Sprite {
    /**
     * Draws this sprite on surface, with the coordinate (leftX, topY) as the
     * top left corner.
     */
    void draw(Graphics surface, int leftX, int topY);

    /** Returns the width of the sprite. */
    int getWidth();

    /** Returns the height of the sprite. */
    int getHeight();
}
