import java.util.Scanner;

public class Advance_pattern_problem {

    public static void main(String[] args) {
//Scanner class
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value ");
        int n = scan.nextInt();
//Butterfly pattern 
        System.out.println("Buterfly Pattern");
       
         int row ,col ;
        
        // First half of the butterfly pattern
        for (row = 1; row <= n; row++) {
            // Left stars
            for (col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // Middle spaces
            for (col = 1; col <= 2 * (n - row); col++) {
                System.out.print("  ");
            }
            // Right stars
            for (col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Second half of the butterfly pattern
        for (row = n; row >= 1; row--) {
            // Left stars
            for (col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // Middle spaces
            for (col = 1; col <= 2 * (n - row); col++) {
                System.out.print("  ");
            }
            // Right stars
            for (col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//Diamond Shape Pattern
        
        System.out.println("Diamond shape pattern ");
        //outer half loop
        for( row = 1 ; row <= n ; row++){
            //inner half loop
                //for pring space   
            for ( col = 1; col <= n-row; col++) {
                System.out.print("  ");
            }
            //for star pring
            for ( col = 1; col <= 2*row - 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //reverse loop for diamond shape 

        for( row = n-1 ; row >= 1 ; row--){
            //inner half loop
                //for pring space   
            for ( col = 1; col <= n-row; col++) {
                System.out.print("  ");
            }
            //for star pring
            for ( col = 1; col <= 2*row - 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }//end of diamond loop 

// Hollow pyramid pattern 
        System.out.println("Hollow Pyramid Pattern ");
        
        //outer loop
       for (row = 1 ; row <= n ; row ++){
        
        // for (col = 1 ; col <= n-row ; col++){
        //     System.out.print(" ");
        // }
        
        for( col= 1; col <= 2*n -1 ; col++ ){
            
            if (col == (n-row)+1 ){
                System.out.print("* ");
                
            }

            else if (col == n + (row - 1)) {
                System.out.print("* ");
                
            }

            else if (col == n && row == 1) {
                System.out.print("* ");
                
            }

            else if (row == n) {
                System.out.print("* ");
                
            }
            else{
                System.out.print("  ");
            }
                           
        }
        System.out.println();

    }
    //hollow 
    System.out.println("Aryan 's Code ");
    //loop
    for (row = 0 ; row < n ; row ++){
        //col
        for(col =1 ; col < 2*n ; col++ ){
            if (col == n-row || col == n+row || (row==n-1 && col%2==1)) {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }

}//end of main class
    
}//end of Advance_pattern_problem class 