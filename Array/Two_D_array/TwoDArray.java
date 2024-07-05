package Array.Two_D_array;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        // Scanner object for input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Row and Column ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        // Program for 2D arrays : Two Dimensional array

        // Initialization : DataType Array_name [][] = new DataaType [row] [column]
        int numbers[][] = new int[row][col] ;

        // taking input of the array
        System.out.println("Enter "+(row*col)+" Element ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                numbers[i][j] = sc.nextInt(); // It's storing the numbers given by the user in "numbers" Array
            }
        }


        // printing the numbers 
        for (int i = 0; i < col; i++) { // for printing the upper row number's for more clarity 
            System.out.print("|\t"+i+"\t|");   // for making code stylish 
        }

        //For terminate the line of upper area 
        System.out.println();
        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                
                System.out.print("|\t"+numbers[i][j]+"\t|"); // "\t" just creating the Tab Spaces during printing the numbers 

            }
            System.out.println();
        }
        
    }    
}
