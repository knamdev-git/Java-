package com.dataStructure;

public class ArmstrongNumber {
	
	public static boolean armstrong(int num, int size) {
		int oldNum = num;
		
		//calculate the power of a number
		int lastDig = 0;
		int newNum = 0;
		
		while(num != 0) {
			// 153 
			lastDig = num % 10; //3
			newNum += Math.pow(lastDig, size);// 3^3 = 27
			num /= 10; //15
		}
		
		if(newNum == oldNum)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		int num = 153;
		
		boolean dec = armstrong(num, 3																																															);
		
		String result = (dec) ? "Number is Armstrong" : "Number is not Armstrong" ; 
		System.out.println(result);
	}
}
