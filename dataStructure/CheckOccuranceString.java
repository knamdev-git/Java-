package com.dataStructure;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CheckOccuranceString {
	static void checkOccurance(String word) {
		
		word = word.toLowerCase();
		
		HashMap<Character, Integer> map = new HashMap<>();
		int count = 1; // by defualt each letter count is one 
		
		//firstly store the letter of word one by one 
		for(int i = 0; i < word.length(); i++) {
			// if the letter already in map then increase the size of its count i.e. Value
			if (map.containsKey(word.charAt(i))) {
				int value = map.get(word.charAt(i)); //return the value of that letter 
				map.put(word.charAt(i), value+1);
			} else {
				map.put(word.charAt(i), count);
			}
		}
		
		int MaxValue = Integer.MIN_VALUE;
		
		
	}
	
	public static void main(String[] args) {
		//Scanner for input a word
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the word for checking occurance : ");
		String word = sc.next();
		
		//automatically call after entering the word
		checkOccurance(word);
	}
}
