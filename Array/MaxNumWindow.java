package com.dataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MaxNumWindow
{
    public static int[] maxNum(int[] arr, int k){
        int i = 0;
        int j= 0;
        
        int currNum = 0, MaxNum = Integer.MIN_VALUE;
        
        List <Integer> list = new ArrayList<>();
        
        while(j < arr.length){
            currNum = arr[j];
            
            MaxNum = compare(currNum, MaxNum);
              
            if(j-i+1 < k) { // k is window
            	j++ ;
            } 
            else if(j-i + 1 == k){
            	list.add(MaxNum);
            	
            	if(arr[i] == MaxNum){
                    MaxNum = Integer.MIN_VALUE;
                    for(int x = i+1; x <= j; x++){
                        MaxNum = compare(MaxNum, arr[x]);
                    }
                }
            	
            	i++;
            	j++;
            }
        }
        
        return list.stream().mapToInt(n -> n).toArray();
    }
    
	private static int compare(int currNum, int maxNum) {
		if(currNum > maxNum) {
			return currNum;
		}
		else {
			return maxNum;
		}
	}
	
	public static void main(String[] args) {
		int [] arr = {3,2,1};
		int k = 2;
		arr = maxNum(arr, k);
		System.out.println(Arrays.toString(arr));
	}
}