import java.util.Scanner;

public class ReverseNumber {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter the Number : ");
    int number = scan.nextInt(); // reverse value 
    //123
    int reversedValue = 0;
    
    while (number != 0) {
      reversedValue *= 10 ; 
      reversedValue += (number % 10) ;
      number /= 10 ; 
    }

    System.out.println("Reversed Number is : "+reversedValue);
  }  
}
