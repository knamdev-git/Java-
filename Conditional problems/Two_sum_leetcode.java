import java.util.Scanner ;

public class Two_sum_leetcode {
    
    public static void two_sum(int num ){
         //count sum of a given number 
         int sum = 0 , rem , count = 0 ;
        
         while (num != 0) {
                
             rem = num % 10 ;
             sum = sum + rem  ;
             num/= 10 ;
             count++ ;
         }
         if (count > 1) {
            two_sum(sum);
         }
         //printing loop value
         else{
            System.out.println("The Sum is sum "+sum);
         }
         
     }
    
    public static void main(String[] args) {
        //
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt() ;
        two_sum(num);
        
    }
}
