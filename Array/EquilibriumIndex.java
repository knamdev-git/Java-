import java.util.Arrays;

class Array{
  //instance variable 
  int arr[];
  
  Array(int[] arr){
    this.arr = arr;
  }

  protected int sum(int[] arr , int start , int end){
    int sum = 0;
    for (int i = start; i <= end; i++) 
      sum += arr[i];

    return sum;
  }

  protected void returnIndex(){
    System.out.println("Array is : "+Arrays.toString(arr)+"\nTotal length of this arr is : "+this.arr.length);

    int midIndex = (this.arr.length) / 2 ; // like length : 7 , then midIndex = 3 "igonres decimal becuase -> int"

    System.out.println("Midd Index : "+midIndex);
    int res1 = sum(this.arr, 0, midIndex-1);
    int res2 = sum(this.arr, midIndex+1, this.arr.length-1);
    
    System.out.println((res1 == res2) ? "The Array index is : "+midIndex : "Not have any Specific Index which is Equilibrium");
  }

}

public class EquilibriumIndex {
  public static void main(String[] args) {
    Array obj = new Array(new int[]{1,2,0,3,0,3,0}); // passing an anonymous array -7,1,5,2,-4,3,0 to the consturctor of the Array Class 
    obj.returnIndex();
  }  
}
