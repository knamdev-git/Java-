import java.util.Scanner ;

public class Pattern_prob {

  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);

     // taking input row 
     int  n = scan.nextInt();

     // for row 1 to n 
     for (int row = 1; row <= n ; row++) {
       // space 
       for (int col = 1; col <= 5-row ; col++) {
        System.out.print("  ");
       }
       //decrement number 
       for (int col = row; col >= 1 ; col--) {
        System.out.print(col+" ");
       }
       //increment number 
       for (int col = 2 ; col <= row; col++) {
        System.out.print(col+" ");
       }
       System.out.println();
     }

     //Print half pyramid 

     for (int  row = 0; row < args.length; row++) {
      
     }
  }
}