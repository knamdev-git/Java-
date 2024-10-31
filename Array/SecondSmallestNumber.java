// Second smallest number in java 
import java.util.Arrays;
import java.util.Scanner;

class NumberClass {

  //first method to find the second min with sorting element but it's complexity is high 

  public void findingSecSmallest(int[] arr){
    // [2,1,3,4,0,5]
    // kya arr[i] < arr[j] : if yes than store arr[i] into min
    // outer loop me if min is less than arr[i] we will again store the min 
    
    int min = arr[0] , latest_min = 0 , great_min = 0 , secMinVal;

    // for ( int i = 0; i < arr.length; i++) {
    //   min = arr[i]; //2

    //   for (int j = 0; j < arr.length; j++) {
    //     if(min < arr[j]){
    //       latest_min = arr[i]; //
    //     }
    //     else{
    //       great_min = arr[j];
    //     }

    //     if(latest_min < great_min){
    //       min = latest_min ;
    //     }
    //     else{
    //       min = great_min;
    //     }
    //   }
    // }

    Arrays.sort(arr); //by arranging all the values first in the array it is easy to find the Minimum and maximum value in the array either the array is sorted or not , So only first task is to do that we just have to focus on sorting the array by direct inbuild method than we can easily define which is second largest value and it's taking nlogn time complexity because inbuilt method is using Quick Sort : n log n .

    System.out.println("\nSmallest Value is "+arr[0]);
    System.out.println("Second Largest Value in array is : "+arr[1]);
  }

    //Another approach is that to solve the problem by O(n) time complexity 
    public void antoherMethodSecMin(int[] array){
      int min = Integer.MAX_VALUE;
      int sec_min = Integer.MAX_VALUE;
        
       for (int i = 0; i < array.length; i++) {
        
        if(array[i] < min){
          sec_min = min ;
          min = array[i];
        }
        else if(array[i] < sec_min){
          sec_min = array[i];
        }

       } // for loop ends
        System.out.println("\nThe minimum number is: "+min);
        System.out.println("The Second Minimum Number is: "+sec_min);
      }
}

public class SecondSmallestNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the array size : ");
    int[] number =  new int[sc.nextInt()];

    System.out.println("Size of the array is : "+number.length);
    
    for (int i = 0; i < number.length; i++) {
      number[i] = sc.nextInt(); //taking n elements 
    }

    // finding smallest number from Arrays
    NumberClass objNumber = new NumberClass();
    objNumber.findingSecSmallest(number);
    objNumber.antoherMethodSecMin(number);
  }
}
