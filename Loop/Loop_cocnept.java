import java.util.Scanner;

public class Loop_cocnept {
    public static void main(String[] args) {
        
//printing any number of table
        Scanner scan = new Scanner(System.in);
        
            System.out.printf("Enter the number ");
        //taking input 
            int num = scan.nextInt();

        //print logic 
            for(int i = 1 ; i <= 10 ; i++){
                System.out.println(num*i);
            }
    }
}
