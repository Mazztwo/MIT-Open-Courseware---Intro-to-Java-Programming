/*
 * MIT Open Courseware
 * Intro to Programming in Java
 * 
 * Assignment 1: Gravity Calculator
 * Computes distance an object fall's in Earth's gravity.
 * 
 * Assignments can be found at the following link: 
 * http://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-092-introduction-to-programming-in-java-january-iap-2010/index.htm
 */ 



public class GravityCalculator
{
	public static void main(String[] args)
	{
	
		double gravity = -9.81;
		double initialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = 0.0;
		
		
		// Plugs values into position equation to find the final position of an object.
		finalPosition = (0.5*gravity*(fallingTime*fallingTime)) + (initialVelocity*fallingTime) + initialPosition;
		
		System.out.println("The object's position after" + fallingTime + " seconds is " + finalPosition + " m");
		

	}
}