package com.Arrays.java;

public class EvenNumSum {

	public static void main(String args[])
	{
		int[] myArray = {10,25,30,49,50,60};
		int evenSum = 0;
		
		for(int i = 0 ; i< myArray.length ; i++)
		{
			if(myArray[i] % 2 == 0)
			{
				evenSum = evenSum + myArray[i];
			}
		}
		System.out.println(evenSum);
	}
}
