import java.util.Arrays;
import java.util.Scanner;
/**
 * TD_array_traverse
 */
public class TD_array_traverse {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    /*Two D array
     * -> first take the element in array 
     * -> create transpose 2D array identifier name is Transpose 
     * -> now transpose reverse of matrix row = col and col = row
     * -> in last, print the array 
     */
    System.out.println("Enter Rows and Column ");
     int row =s.nextInt(); int col = s.nextInt() ;
     int[][] matrix = new int[row][col];

    //1 step
     for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        matrix[i][j] = s.nextInt();
      }
     }

    System.out.println("Simple Matrix ");

    for (int[] is : matrix) {
      System.out.println(Arrays.toString(is));
    }

     //2 step
     int transpose[][] = new int[col][row];

     //Storing the elements in transpose array 
     for (int i = 0; i < transpose.length; i++) {
      for (int j = 0; j < transpose.length; j++) {
        transpose[j][i] = matrix[i][j];
      }
     }

     //printing the array 
     
     System.out.println("\nTranspose of the Matrix ");
     
     for (int[] is : transpose) {
      System.out.println(Arrays.toString(is));
     }
   
     s.close();
  }
}