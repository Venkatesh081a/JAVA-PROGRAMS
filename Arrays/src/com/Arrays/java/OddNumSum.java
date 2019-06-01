package com.Arrays.java;

public class OddNumSum {

	public static void main(String args[])
	{
		int[] myArray = {10,25,30,49,50,60};
		int oddSum = 0;
		
		for(int i = 0 ; i< myArray.length ; i++)
		{
			if(myArray[i] % 2 != 0)
			{
				oddSum = oddSum + myArray[i];
			}
		}
		System.out.println(oddSum);
	}
}
