class LinearSearch{
  public static int search(int[] arr, int target){
    for(int val : arr){
      if(val == target) return 1;
    }
    return -1;
  }

  public static void main(String[] args){
    int[] arr = {1,3,4,5};
    int res = search(arr, 3);
    System.out.print(val);
  }
}
