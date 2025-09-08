/*
    By Summation Approach 
        1. Calculate the summation of all the values by n * n+1 / 2
        2. then Calculate the diff bw summation and sum of all number 
        3. return the diff 
*/
class Main{

    //chck for the missing number 
    public static int missingValueReturn(int[] nums){
        int n = nums.length;
        int summation = n * (n+1) / 2;
    
        int sum = 0;
        
        for(int val : nums)
            sum += val;
        
        return (summation-sum);
    }



  public static void main(String[] args){
      int[] nums = {1, 3, 6, 4, 2, 5};
      int val = missingValueReturn(nums);
      System.out.print(val);
      
  }
}
