public class CheckArraySubArray {

  private boolean search(int value, int[] arr){

    for (int i = 0; i < arr.length; i++) {
      if(value == arr[i])
        return true ;
    }
    return false;
  }

  public void checkSubArray(int[] arr1, int[] arr2){
    boolean b = false;
    for (int ele : arr1) {
      b = search(ele, arr2);
      if (b) {} else break;
    }
    System.out.println((b) ? "The arr1 is subarray of arr2" : "arr1 is not subarray of arr2");  
  }

  public static void main(String[] args) {
    int[] arr1 = new int[]{1,2,3,4} ;
    int[] arr2 = new int[]{4,2,3,8,-2,50,101};

    CheckArraySubArray obj = new CheckArraySubArray();
    obj.checkSubArray(arr1, arr2);
  }
}