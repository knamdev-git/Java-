/******************************************************************************

Algorithm to right shift the array k times

First reverse  the k-1 element
then reverse the ele from k to length-1
then reverse the entire array

*******************************************************************************/
import java.util.*;

class Solution {
    public static void rotateArray(int[] nums, int k) {
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, nums.length-1);
        reverseArray(nums, 0, nums.length-1); //entire array reversed
    }

    public static void reverseArray(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start, end);
            ++start ;
            --end ;
        }
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        rotateArray(arr, 3);
        System.out.print(Arrays.toString(arr));
    }
}
