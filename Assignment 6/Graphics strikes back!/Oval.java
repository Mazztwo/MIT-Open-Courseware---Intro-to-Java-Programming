/* MIT Open Courseware
 * Intro to Programming in Java
 * 
 * Assignment 6: Graphics strikes back!
 * This file is a class that creates an oval sprite and draws it.  
 * 
 * Assignments can be found at the following link: 
 * http://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-092-introduction-to-programming-in-java-january-iap-2010/index.htm
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Oval implements Sprite
{
	private Color color;
	private int width; 		
	private int height;
	
	
	public Oval(int width, int height, Color color)
	{	
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public void draw(Graphics surface, int x, int y) 
	{
		surface.setColor(color);
		surface.fillOval(x, y, width, height);
		surface.setColor(Color.PINK);
		((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
		surface.drawOval(x, y, width, height);
	}
	
	public int getWidth() 
	{
		return width;
	}

	public int getHeight() 
	{
		
		return height;
	}
	
	
	
	
}
