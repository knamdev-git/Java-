package Array;
import java.util.Scanner;

public class Check_Array_Ascending_or_not {
    public static void main(String[] args) {

        // Scanner class for taking input 
        Scanner scan = new Scanner(System.in);

        System.out.println("Define Size of array ");
        int size = scan.nextInt();

        // Defining array 
        int array[] = new int[size];

        System.out.println("Enter "+size+" digits ");
        
        // Starting loop for taking the inputs of array
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        // Defining the value "Boolean" for just checking the condition true or not 
        boolean cond = false ;
       
        for (int i = 0; i < (array.length)-1; i++) {
            
            if (array[i] < array[i+1]) {
                    cond = true ;
                }
                else{
                    cond = false ;
                }
            }

        if (cond) {
            System.out.println("Array is in Ascending order ");
        }
        else{
            System.out.println("Array is not in ascending order ");
        }
    }
}
