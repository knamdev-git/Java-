import java.util.Scanner ;

public class pattern_print {

    public static void main(String[] args) {

        //Scanner class for input 
        Scanner sc = new Scanner(System.in);
        System.out.println("Type Number ");
        int n = sc.nextInt();
        int row , col ;
//for Solid Rectangle Pattern 
        System.out.println("Solid Rectangle");
        for(row = 1 ; row <= n ; row++ ){
            for ( col = 1; col <= n+1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//for Hollow Rectangle Pattern 
        System.out.println("Hollow Rectagle");
        for (row =1 ; row <= n ; row++){
            for (col = 1 ; col <= n+1 ; col++){
                if ( row ==1 || col == 1 || row == n || col == n+1 ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

//Half pyramid Pattern 
        System.out.println("Half Pyramid Rectagle");
        for ( row = 1; row <= n; row++) {
            for (col = 1 ; col <= row ; col ++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//Inverted Half Pyramid 
        System.out.println("Inverted Half Pyramid ");
        for(row = 1 ; row <= n ; row++){
            for ( col = 1 ; col <= n - row+1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//Inverted Half Pyramid rotated by 180 degree 
        System.out.println("Inverted Half Pyramid rotated by 180 degree");
        for ( row = 1; row <= n; row++) {
            //space
            for ( col = 1; col <= n - row ; col++){
                System.out.print("  ");
            }
            //star
            for ( col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//Half Pyramid with Number's
        System.out.println("Half Pyramid with NUmbers ");
        for ( row = 1; row <= n; row++){
            for ( col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
//Inverted Half Pyramid with Number's
        System.out.println("Half Pyramid with Numbers");
        for ( row = 1; row <= n; row++) {
            for (col = 1 ; col <= n - row + 1 ; col++)
                System.out.print(col+" ");
            //printing space 
            System.out.println();
        }
//Floyd's Triangle 
        System.out.println("Floyd's Triangle");
        //we need to use while loop and defiine number variable 
        int number = 1 ;
            for (row = 1; row <= n; row++) {
                //col
                for ( col = 1; col <= row; col++) {
                    System.out.print(number+" ");
                    number++ ;
                }
                System.out.println();
            }
// 01 triangle 
            System.out.println("01 triangle");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    if ((i + j) % 2 == 0) { //sum is even 
                        System.out.print("1 ");
                    }
                    else{ //sum is odd 
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
// print a solid rhombus 
            System.out.println("Print a solid rhombus");
            for (row = 1 ; row <= n ; row ++){
                //space 
                for (col =1 ; col <= n - row ; col++){
                        System.out.print("  ");
                }
                //star
                for (col = 1 ; col <= n ; col ++){
                    System.out.print("* ");
                }
                System.out.println();
            }
//Number pyramid
            System.out.println("Number pyramid");
            for (int i = 1; i <= n; i++) {
                // space 
                for (int j = 0; j <= n-i; j++) {
                    System.out.print(" ");
                }
                //star
                for (int j = 1; j <= i; j++) {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
//palindromic number pyramid
            System.out.println("Palindromic number pyramid");
            for (row = 1; row <= n; row++) {
                //space
                for ( col = 1; col <= n - row; col++) {
                  System.out.print("  ");  
                }
                //number row to 1 : desending form
                for(col = row ; col >= 1 ; col--){
                    System.out.print(col+" ");
                }
                //number (1 + 1) to row
                for(col = 1+1 ; col <= row ; col++){
                    System.out.print(col+" ");
                } 
                System.out.println();
            }
    }
}//end main class 
