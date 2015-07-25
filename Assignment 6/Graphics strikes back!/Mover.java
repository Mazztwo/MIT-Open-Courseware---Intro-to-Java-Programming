/* MIT Open Courseware
 * Intro to Programming in Java
 * 
 * Assignment 6: Graphics strikes back!
 * This file is a interface for objects to move.
 * 
 * Assignments can be found at the following link: 
 * http://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-092-introduction-to-programming-in-java-january-iap-2010/index.htm
 */
import java.awt.Graphics;

public interface Mover
{
	 /** Starts moving the object in the direction (xIncrement, yIncrement). */
    public void setMovementVector(int xIncrement, int yIncrement);
    
    /** Draws the sprite at its current position on to surface. */
    public void draw(Graphics surface);
}
