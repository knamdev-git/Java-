package com.dataStructure;

import java.util.Scanner;

public class CountDigitPresent {

	public static void getCount(int num) {
		int count = 0;
		
		while(num != 0) {
			num /= 10;
			count++;
		}
		System.out.println(count);
	}

	public static boolean getPallindrome(int num) {
		// reverse num 
		int oldnum = num;
		int rev = 0;
		
		while(num != 0) {
			rev = (num%10) + rev*10;
			num /= 10;
		}
		
		if(rev == oldnum) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); // we also declare the literal like <- this
		
		//Method 1
		getCount(num);

		//Method 2
		boolean pallindromNum = getPallindrome(num);
		System.out.println(pallindromNum); //<- it will print true or false for given number is pall..me or not

		//Method 3
		double fact = getFactorial(num);
		System.out.println(fact);
	}

	private static double getFactorial(int num) {
		
		if(num == 0) {
			return 1;
		}
		
		return num * getFactorial(num-1);
	}
}
