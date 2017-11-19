package com.example.admin.week2exam;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Robert Zingarelli
 * Team Android 10-30
 * @author Admin
 *
 */
public class Encoder {

	
	public String f(String input)
	{
		
		String forward = "abcdefghijklmnopqrstuvwxyz";
		String backwards = "zyxwvutsrqponmlkjihgfedcba";
		String forward_upper = forward.toUpperCase();
		String backwards_upper = backwards.toUpperCase();
		//input = input.toLowerCase();
		int input_size = input.length();
		int index = 0;
		int forward_index = 0;
		char[] encoded_array = new char[input.length()];
		
		while (index < input_size)
		{
			boolean isUpper = false;
			char c = input.charAt(index);
			if (c > 64 && c < 91) //if character is uppercase, let's preserve that
			{
				isUpper = true;
				forward_index = forward_upper.indexOf(c);
			}
			else
			{
				forward_index = forward.indexOf(c);
			}
			
			if (forward_index == -1) //this means we have a non-alpha character, so we just skip over this
			{
				encoded_array[index] = c;//building our return array
				index++;
				continue;
			}
			if (isUpper == true)
			{
				c = backwards_upper.charAt(forward_index);
			}
			else
			{
				c = backwards.charAt(forward_index);
			}		
			encoded_array[index] = c; //building our return array
			index++;
		}
		String encoded = new String(encoded_array);
		return encoded;
	}
	public HashMap<String, Integer> g(String input)
	{
		HashMap<String, Integer> letter_counter = new HashMap<String, Integer>();
		int character_incrementer = 'a';
		input = input.toLowerCase();
		int index = 0;
		char[] c = new char[1];
		while (index < 26)
		{
			c[0] = (char)character_incrementer;
			letter_counter.put(new String(c), new Integer(0)); //basically initializing all the letters of the alphabet and 0 values to start
			character_incrementer++;
			index++;
		}
		index = 0;
		int input_size = input.length();
		while (index < input_size)
		{
			char ch = input.charAt(index);
			if (ch < 97 || ch > 122)
			{
				index++;
				continue;
			}
			c[0] = ch;
			String key = new String(c);
			Integer count = letter_counter.get(key);
			count = count.intValue()+1;
			letter_counter.put(key, count);
			index++;
		}
		//first we initialize the values in our hashmap, which will contain a letter of the alphabet as the key and an integer count as the value
		return letter_counter;
	}
	public static void main(String[] args) {
		Encoder e = new Encoder();
		String test = "1cat";
		String test2 = "HellO";
		String test3 = "1234";
		String test4 = "";
		String test5 = "Errors in strategy cannot be correct through tactical maneuvers";
		String encoded = "";
		String encoded2 = "";
		String encoded3 = "";
		String encoded4 = "";
		String encoded5 = "";
		encoded = e.f(test);
		encoded2 = e.f(test2);
		encoded3 = e.f(test3);
		encoded4 = e.f(test4);
		encoded5 = e.f(test5);
		System.out.println("Input value: " + test + " Encoded value: " + encoded);
		System.out.println("Input value: " + test2 + " Encoded value: " + encoded2);
		System.out.println("Input value: " + test3 + " Encoded value: " + encoded3);
		System.out.println("Input value: " + test4 + " Encoded value: " + encoded4);
		System.out.println("  Input value: " + test5 + " \nEncoded value: " + encoded5);
		HashMap<String, Integer> output = new HashMap<String, Integer>();
		output = e.g("robert");
		System.out.println("Input string: " + "robert");
		System.out.println("Data structure values:");
		for (Iterator<String> i = output.keySet().iterator(); i.hasNext();)
		{
			String key = (String) i.next();
			Integer value = output.get(key);
			System.out.println(key + ": " + value);
		}
		output = e.g("12robert34");
		System.out.println("Input string: " + "12robert34");
		System.out.println("Data structure values:");
		for (Iterator<String> i = output.keySet().iterator(); i.hasNext();)
		{
			String key = (String) i.next();
			Integer value = output.get(key);
			System.out.println(key + ": " + value);
		}
		output = e.g("Hello there! Apple!");
		System.out.println("Input string: " + "Hello there! Apple!");
		System.out.println("Data structure values:");
		for (Iterator<String> i = output.keySet().iterator(); i.hasNext();)
		{
			String key = (String) i.next();
			Integer value = output.get(key);
			System.out.println(key + ": " + value);
		}

	}
}
