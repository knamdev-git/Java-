import java.util.ArrayList;

class Main {
    public static void moveZeroes(int[] nums) {
        int i = 0;
        
        for(int val : nums){
            if(val != 0)
                nums[i++] = val;
                // i++ ;
        }
        
        while(i < nums.length){
            nums[i] = 0;
            i++;
        }
    }
    
    public static void main(String[] args){
        int[] arr = {0,1,4,0,5,2};
        moveZeroes(arr);
        
        for(int v : arr)
            System.out.print(v+" ");
    }   
    
    
    
}
