/* MIT Open Courseware
 * Intro to Programming in Java
 * 
 * Assignment 6: Graphics strikes back!
 * This file is a class that creates a Bouncer and can draw and move sprites.
 * 
 * Assignments can be found at the following link: 
 * http://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-092-introduction-to-programming-in-java-january-iap-2010/index.htm
 */

import java.awt.Graphics;

public class Bouncer implements Mover
{
    private int x;
    private int y;
    private int xDirection;
    private int yDirection;
    private Sprite sprite;

    /** Create a Bouncer that positions sprite at (startX, startY). */
    public Bouncer(int startX, int startY, Sprite sprite) 
    {
        x = startX;
        y = startY;
        this.sprite = sprite; 
    }

    /** Starts moving the object in the direction (xIncrement, yIncrement). */
    public void setMovementVector(int xIncrement, int yIncrement) {
        xDirection = xIncrement;
        yDirection = yIncrement;
    }

    /** Draws the sprite at its current position on to surface. */
    public void draw(Graphics surface) {
        // Draw the sprite
        sprite.draw(surface, x, y);

        // Move the object each time we draw it
        x += xDirection;
        y += yDirection;

        // If we have hit the edge and are moving in the wrong direction, reverse direction
        // We check the direction because if a box is placed near the wall, we would get "stuck"
        // rather than moving in the right direction
        if ((x <= 0 && xDirection < 0) ||
                (x + sprite.getWidth() >= SimpleDraw.WIDTH && xDirection > 0)) {
            xDirection = -xDirection;
        }
        if ((y <= 0 && yDirection < 0) ||
                (y + sprite.getHeight() >= SimpleDraw.HEIGHT && yDirection > 0)) {
            yDirection = -yDirection;
        }
    }
}
