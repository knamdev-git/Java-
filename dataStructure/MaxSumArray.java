package com.dataStructure;

public class MaxSumArray {
	public static void main(String[] args) {
		int[] arr = {2,5,1,8,2,9,1};
		
		int k = 3; //window Size
		
		findMaxSum(arr, k);
	}

	private static void findMaxSum(int[] arr, int k) {
		int i = 0, j=0;
		int sum = 0;
		int MaxSum = Integer.MIN_VALUE;
		
		while(j < arr.length) {
			sum += arr[j];
			
			if(j-i + 1 < k){
				j++; //j increments and simultaneously the sum will calculate
			}
			else if(j-i + 1 == k) {
				MaxSum = compare(sum, MaxSum);
				
				// decrease the sum value by ith position 
				sum -= arr[i];
				
				i++;
				j++;
			}
		}
		
		System.out.println("Maximum sum is : "+MaxSum);
	}

	private static int compare(int sum, int maxSum) {
		if(sum >= maxSum)
			return sum;
		else 
			return maxSum;
	}
}
