package com.java;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {

	static void randomize(int arr[])
	{
		//creating the object of Random
		Random r = new Random();

		for(int i=arr.length-1; i>0; i--)
		{

			//pick a random index from o to i
			int j = r.nextInt(i+1);

			//swap arr[i] with the element at random index
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;					
		}

		//printing the random array
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) 
	{

		int [] arr = {1,2,3,4,5,6,7};
		randomize(arr);
	}
}


