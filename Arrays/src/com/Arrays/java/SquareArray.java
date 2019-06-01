package com.Arrays.java;

public class SquareArray {

	public static void main(String args[])
	{
		int[] myArray = {10,20,30,40,50};
		
		for(int i=0;i<myArray.length;i++)
		{
			myArray[i] = (int) Math.pow(myArray[i], 2);
		}
		
		for(int venky : myArray)
		{
			System.out.println( venky );
		}
	}
}
