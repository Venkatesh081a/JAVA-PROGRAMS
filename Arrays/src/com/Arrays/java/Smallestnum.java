 package com.Arrays.java;

 public class Smallestnum {

  public static void main(String args[])

  {
	int[] myArray = {20,40,80,60,10};
	int SmallestNum = myArray[0];
	
	for(int i = 0 ; i < myArray.length ; i ++)
	{
		if(SmallestNum > myArray[i])
		{
			SmallestNum = myArray[i];
		}
	}
	System.out.println(SmallestNum);
 }
 }
