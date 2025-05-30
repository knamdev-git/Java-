import java.util.Arrays;
import java.util.Scanner ;

public class AddEleArray {

  public static void insertBegin(int[] arr , int value){
    int[] arr2 = new int[arr.length+1];
    int j = 1 ;
    for (int i : arr) {
      arr2[j] = i ;
      j++;
    }
    arr2[0] = value;
    System.out.println("Begin edit : "+Arrays.toString(arr2));
  }

  public static int[] insertEnd(int[] arr, int value){
    int[] arr2 = new int[arr.length+1];
    int j = 0 ;
    for (int i : arr) {
      arr2[j] = i ;
      j++;
    }
    arr2[arr2.length-1] = value;

    return arr2;
    // System.out.println("After end edit : "+Arrays.toString(arr2));
  } 
  
  public static void insertInMiddle(int[] arr , Scanner sc, int value){
    
    System.out.println("Provide the position where you wanna Insert : ");
    int index = sc.nextInt();
    int[] arr2 = new int[arr.length+1];

    logic1:{
      if(index > arr.length-1){
        System.out.println("Invalid position");
        break logic1;  
      }
      int j = 0;

      for (int i = 0; i < arr2.length; i++) {
        if(i == index){
          arr2[i] = value ;
          continue;
        }
        arr2[i] = arr[j];
        j++;
      }
      System.out.println("Adding "+value+" at index "+ index +" is : "+Arrays.toString(arr2));
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the legnth of the array : ");
    int[] arr = new int[sc.nextInt()];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    insertInMiddle(arr,sc,101);
    arr = insertEnd(arr, 10);
    insertBegin(arr, 100);
    System.out.println("After inserting at the end : "+Arrays.toString(arr));
 } 
}
