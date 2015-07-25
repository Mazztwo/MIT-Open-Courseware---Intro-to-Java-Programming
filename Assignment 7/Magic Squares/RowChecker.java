/*
 * MIT Open Courseware
 * Intro to Programming in Java
 * 
 * Assignment 7: Magic Squares
 * This file is a class that will read a N x N square file of integers and check to
 * see that each row adds up to the same constant.
 * 
 * Assignments can be found at the following link: 
 * http://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-092-introduction-to-programming-in-java-january-iap-2010/index.htm
 */ 
import java.io.*;

public class RowChecker 
{
	public static void checkRows(BufferedReader file, String fileName) throws IOException
	{
		boolean rowSumIsConstant = true;
		String line = file.readLine();
		String[] nums;
		int rowSum = 0;
		
		if(line!=null)
		{
			nums = line.split("\t");
			
			for(int i = 0; i < nums.length; i += 1)
			{
				rowSum += Integer.valueOf(nums[i]);
			}
		}
		
		//Have it twice to skip over blank row between each line 
		line = file.readLine();

		
		while(line != null)
		{
			nums = line.split("\t");
			int runningSum = 0;
			
			for(int i = 0; i < nums.length; i += 1)
			{
				runningSum += Integer.valueOf(nums[i]);
			}
			
			if(runningSum != rowSum)
			{
				rowSumIsConstant = false;
				break;
			}
			
			line = file.readLine();
		
		}
	
		if(rowSumIsConstant)
		{
			System.out.println("All of the rows in file " + fileName + " add to the constant " + rowSum + ".");
		}
		else
		{
			System.out.println("The rows in file " + fileName + " do not add to the same constant.");
		}
		
	}
	
	
	public static void main(String[] args) throws IOException
	{
		String fileName1 = "Mercury.txt";
		String fileName2 = "Luna.txt";
		
		FileReader mercury = new FileReader(fileName1);
		FileReader luna = new FileReader(fileName2);
		
		BufferedReader mercuryTxt = new BufferedReader(mercury);
		BufferedReader lunaTxt = new BufferedReader(luna);
		
		checkRows(mercuryTxt,fileName1);
		checkRows(lunaTxt,fileName2);
	}
}
