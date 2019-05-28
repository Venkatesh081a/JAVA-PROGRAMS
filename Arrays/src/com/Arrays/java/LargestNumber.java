package com.Arrays.java;

public class LargestNumber {

	public static void main(String args[])
	{
		
		int[] myArray = {20,40,80,60,10};
		int Largestnum = myArray[0];
		
		for(int i = 0 ; i < myArray.length ; i ++)
		{
			if(Largestnum < myArray[i])
			{
				Largestnum = myArray[i];
			}
		}
		System.out.println(Largestnum);
	}
}
