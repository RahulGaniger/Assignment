package com.java;

import java.util.HashSet;
import java.util.Scanner;

public class CheckPangram {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter a string");
		String input = s.nextLine();

		boolean isPangram = checkIfPangram(input);

		if(isPangram)
		{
			System.out.println("given input is pangram");
		}else
		{
			System.out.println("given string is not panagram");
		}
		s.close();

	}

	public static boolean checkIfPangram(String input)
	{
		//to store unique characters
		HashSet<Character> uniqueChar = new HashSet<Character>();

		String lowerCaseInput = input.toLowerCase();

		//iterate through each character in the lower case input
		for (Character c : lowerCaseInput.toCharArray()) {

			//check if the character is an alphabet letter(a to z)
			if(c>='a' && c<='z')
			{
				uniqueChar.add(c);
			}
		}

		//if hashset contains all the 26 letters,its pangram
		return uniqueChar.size()==26;
	}

}
