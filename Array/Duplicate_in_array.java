import java.util.Arrays;
import java.util.Scanner;

/*Checking the Duplicate
   -> Start
 * -> Print the array 
 * -> Take a Number 
 * -> if (num == array[i][j]) element then we print Duplicate number present at this index
 *    else : continue , don't exit the loop till go to the end of the last element of the array 
 * -> End 
 */

public class Duplicate_in_array {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    //Taking input for creating the rows and columns in array matrix
    System.out.println("Enter Rows and Column ");
     int row = scan.nextInt(); int col = scan.nextInt() ;
     int[][] matrix = new int[row][col];

    //1 step
    System.out.println("Enter "+(row*col)+" elements ");

     for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        matrix[i][j] = scan.nextInt();
      }
     }

     //2 step
     for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.println(matrix[i][j]+" ");
      }
      System.err.println();
     }

     System.out.println("Search the Element's Duplicate : ");
     int num = scan.nextInt();

     boolean b = true;

     System.out.println("Simple Matrix : ");

     for (int[] is : matrix) {
      System.out.println(Arrays.toString(is));
     }
     
     System.out.println();
     //3 step : from index i to last element 
     for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (num == matrix[i][j]) {
         b = false;
         System.out.println("Duplicate Present at (" +i+ "," +j+ ")" );
        }
        else
          continue;
        
      }
     }

     if (b)
      System.out.println("No Element found ");
     
     scan.close();
  }
}
