/* MIT Open Courseware
 * Intro to Programming in Java
 * 
 * Assignment 6: Graphics strikes back!
 * This file is a class that initializes the class for drawing and draws contents of window on a surface.
 * 
 * Assignments can be found at the following link: 
 * http://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-092-introduction-to-programming-in-java-january-iap-2010/index.htm
 */

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics 
{
	ArrayList<Mover> movers = new ArrayList<Mover>();

    /** Initializes this class for drawing. */
    public DrawGraphics() 
    {
    	movers.add(new Bouncer(100, 170, new Rectangle(15, 20, Color.RED)));
    	movers.get(0).setMovementVector(3, 3);
    	movers.add(new Bouncer(150,150, new Oval(20,30,Color.GREEN)));
        movers.get(1).setMovementVector(5, 5);
        movers.add(new StraightMover(50, 70, new Rectangle(15, 20, Color.PINK)));
        movers.get(2).setMovementVector(5, 0);
        movers.add(new StraightMover(40, 40, new Oval(20,30,Color.BLUE)));
        movers.get(3).setMovementVector(5, 1);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) 
    {
        for(Mover shape : movers)
        {
        	shape.draw(surface);
        }
        
    }
}

