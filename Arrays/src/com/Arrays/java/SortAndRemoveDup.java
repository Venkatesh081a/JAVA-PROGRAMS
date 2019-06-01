package com.Arrays.java;

public class SortAndRemoveDup {

	public static void main(String args[])
	{
		int[] myArray = {1,5,3,3,4,2,1};
		int temp = 0;
		for(int  i = 0 ; i<myArray.length;i++)
		{
			for(int j = i+1 ; j<myArray.length;j++)
			{
				if(myArray[i] > myArray[j] )
				{
					temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;
				}
			}
		}
		for(int venky : myArray)
		{
			System.out.println(venky);
		}
		
		
		
	}
}
