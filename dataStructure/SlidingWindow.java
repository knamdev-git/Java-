package com.dataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlidingWindow {
	public static int[] findMax(int[] arr, int k) {
		
		int i = 0, j = 0;
		// k == 3
		int max = Integer.MIN_VALUE;
		
		List<Integer> num = new ArrayList<>();
			
		while(j < arr.length) {
			max = compare(arr[j], max);
			
			if(j-i+1 < k) {
				j++ ;
			} else {
				num.add(max);
				
				if(arr[i] == max) {
					max = Integer.MIN_VALUE;
					for(int m = i+1; m <= j; m++) {
						max = compare(arr[m], max);
					}
				}	
				i++;
				j++;
				
			}
		}
		return num.stream().mapToInt(Integer::intValue).toArray();
	}
	
	private static int compare(int val, int max) {
		if(val > max)	max = val;
		return max;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,5,2,4,1,7};
		arr = findMax(arr, 3);
		System.out.println(Arrays.toString(arr)); // 3 is the window size here 
	}
}
