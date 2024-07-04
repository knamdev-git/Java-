import java.util.Scanner;

public class Array_in_Java {
    public static void main(String[] args) {
       
        //taking input 
        Scanner scan = new Scanner(System.in) ;
        
        int len = scan.nextInt(); 

        //New (Keyword) : use to to take new space in memeory which is non premitive data 
        int marks[] = new int[len];
        
        //
        System.out.println("Enter " +len+ " marks ");
        
        for (int i = 0; i < marks.length; i++) {
         marks[i] = scan.nextInt();   
        }
       
        //printing array element 
        for (int i = 0; i < marks.length; i++) {
            System.out.println((i+1)+" student marks "+marks[i]);
        }

        //searching for targeted Marks 
        System.out.println("Enter Marks for search ");
        
        int target = scan.nextInt();

        // Prompt to search the Marks in array 
        for (int i = 0; i < marks.length; i++) {
            if(marks[i] == target){
                System.out.println("This is the " +(i+1)+ " Student Marks");
                return;
            }
            
        }
        System.out.println("Marks not found");

        //Close the Scanner 
        scan.close();
    }
}
