package com.java;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInt {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a roman value");
		String roman = s.next();

		int result = romanToInt(roman);
		System.out.println("Roman numeral "+roman+" is equivalent to integer: " + result);
		s.close();
	}

	public static int romanToInt(String s)
	{
		HashMap<Character, Integer> romanValues = new HashMap<Character, Integer>();
		romanValues.put('I', 1);
		romanValues.put('V', 5);
		romanValues.put('X', 10);
		romanValues.put('L', 50);
		romanValues.put('C', 100);
		romanValues.put('D', 500);
		romanValues.put('M', 1000);

		int res = 0;
		int prevValue = 0;

		for (int i = s.length()-1; i >=0 ; i--) {
			char currentChar = s.charAt(i);
			int currentValue = romanValues.get(currentChar);

			if(currentValue < prevValue)
			{
				res -= currentValue;
			}
			else
			{
				res += currentValue;
			}

			prevValue = currentValue;
		}

		return res;
	}


}
