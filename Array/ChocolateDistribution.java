import java.util.Scanner;
import java.util.Arrays;

public class ChocolateDistribution {

  void distributeChocolate(int[] arr , int m){
    // first sort and after that count the minimum difference between minimun subarray difference 
    Arrays.sort(arr);

    //now calcuate the sub array sum
    int minResult = Integer.MAX_VALUE; 

    for (int i = 0; i < arr.length - m ; i++) { // m is children count 
      int minDiff = arr[i+m-1] - arr[i]; // m is 3'

      if(minDiff < minResult)
        minResult = minDiff;
    }

    System.out.println("Minimum Difference is : "+minResult);
  }

  public static void main(String[] args) {
    //taking an array that consists n number of chocolate packets 
    Scanner sc = new Scanner(System.in);
    
    System.out.println("How many chocolate packets you have : ");
    int packetsNumber = sc.nextInt();

    int[] chocolateArr = new int[packetsNumber];

    System.out.println("Enter each chocolate packets number ");
    for (int i = 0; i < chocolateArr.length; i++) {
      System.out.print((i+1)+" packet : ");
      chocolateArr[i] = sc.nextInt(); //taking input in the array 
    }

    System.out.println("\nEnter children count : ");
    int children = sc.nextInt();
    
    ChocolateDistribution callProperty = new ChocolateDistribution();

    callProperty.distributeChocolate(chocolateArr, children);
  }
}