/*
 * MIT Open Courseware
 * Intro to Programming in Java
 * 
 * Assignment 4: Library
 * This file is a class that initializes this class for drawing.
 * 
 * Assignments can be found at the following link: 
 * http://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-092-introduction-to-programming-in-java-january-iap-2010/index.htm
 */

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics 
{
    ArrayList<BouncingBox> boxes;
    
    /** Initializes this class for drawing. */
    public DrawGraphics() 
    {
    	boxes = new ArrayList<BouncingBox>();
    	
        boxes.add(new BouncingBox(200, 50, Color.GREEN));
        boxes.get(0).setMovementVector(1,3);
        
        boxes.add(new BouncingBox(100, 100, Color.BLUE));
        boxes.get(1).setMovementVector(3,5);
        
        boxes.add(new BouncingBox(50,50, Color.CYAN));
        boxes.get(2).setMovementVector(6, 6);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) 
    {
        surface.drawLine(50, 50, 250, 250);
        
        surface.drawOval(20, 20, 50, 50);
        surface.drawRect(20, 100, 15, 60);
        surface.drawArc(100, 30, 40, 40, 20, 30);
        
        for(int i = 0; i < boxes.size(); i = i + 1)
        {
        	boxes.get(i).draw(surface);
        }
    }
} 