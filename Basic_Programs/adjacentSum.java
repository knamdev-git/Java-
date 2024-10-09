import java.util.Scanner;

public class adjacentSum {
 public static void main(String[] args) {
  /* -> First we take number 
     -> 123456, loop chalao jab tak ki number zero na ho 
     -> or saare reminders ko sum =  0 ke sath add karte jao 
     -> decrease karo number ko 10 se divide karke 
  */ 
  Scanner scan = new Scanner(System.in);

  System.out.println("Enter the Number : ");
  int num = scan.nextInt();
  
  int sum = 0 , rem = 0;
  
  while (num != 0) {
    rem = num % 10 ; //1234 = 4
    sum += rem; // 0 + 4 = 4 
    num /= 10; //123
  }

  System.out.println("Adjacent Values Sum is : "+sum);
 } 
}
