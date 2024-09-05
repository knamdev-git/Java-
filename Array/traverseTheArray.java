/* There are two ways for traverse : To see the elements present in the array
    * By Using loops 
          - simply we use for loops
            -> for loop
            -> for each loop (New topic in Java not present in C) 
          
*/
public class traverseTheArray {
 
  public static void main(String[] args) {
    // Array
    traverse(new int[]{1,2,3,4,5}); // Anonymous Array : initalization 
  }

  //Traverse function
  public static void traverse(int[] arr){
      //for each loop
      for (int i : arr) {
        System.out.println("First Element : "+i);
      }
  }
}
