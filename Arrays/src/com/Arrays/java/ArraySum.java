package com.Arrays.java;

public class ArraySum {

	public static void main(String args[])
	{
		int[] myArray = {10,20,30,40};
		int sum = 0;
		
		for(int venky : myArray)
		{
			sum = sum + venky;
		}
		System.out.println("sum of all the elements in the array is " +sum);
	}
}
