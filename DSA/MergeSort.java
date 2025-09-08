import java.util.*;
import java.lang.*;
import java.io.*;

class MergeSort
{
    
    public static void mergeSort(int[] arr, int low, int high){
        int mid = low + (high - low)/2;
        if(low < high){
            //break the arr upto left 
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }    
    }
    
    public static void merge(int[] arr, int low, int mid, int high){
        int left = low;
        int right = mid+1;
        //creating the extra arrayList
        ArrayList<Integer> list = new ArrayList<>();
        
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                list.add(arr[left]);
                left++ ;
            }
            else{
                list.add(arr[right]);
                right++ ;
            }
        }
        
        while(left <= mid){
            list.add(arr[left]);
            left++ ;
        }
        
        while(right <= high){
            list.add(arr[right]);
            right++ ;
        }
        
        for(int i=low; i <= high; i++){
            arr[i] = list.get(i-low);
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
        int[] arr = new int[]{2,1,4,2,3};
	    mergeSort(arr, 0, arr.length-1);
	    
	}
}
