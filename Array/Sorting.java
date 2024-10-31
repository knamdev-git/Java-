import java.util.Arrays;
import java.util.Scanner;


public class Sorting {

  public static void toSearch(int[] arr , int target){
    //in this array 
    for(int i = 0 ; i < arr.length ; i++){
      if(target == arr[i]){
        System.out.println(target+" found at "+(i+1)+" position");
      }
    }
  }
  
  
  public static void main(String[] args) {
    int[] arr = {3,4,1,3,1,12,2,4,5,0,5,4,2}; 
    Arrays.sort(arr); //here quick sort is applied internaly by a inbuild method 

    System.out.println(Arrays.toString(arr));

    int target = 5 ;
    toSearch(arr, target);
  }
}