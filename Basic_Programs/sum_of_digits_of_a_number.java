import java.util.Scanner;

public class sum_of_digits_of_a_number {
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter a Number");
    long num = sc.nextLong();
    num = caluclate_sum(num);
    System.out.println("Sum is : "+num);

    sc.close();
  }

  // Function for calculating the present digits 
  static long caluclate_sum(long num){
    long rem ;
    int sum = 0 ; 
    while (num != 0) {
      sum += num % 10 ;
      num /= 10 ;
    }
    return sum ;
  }
}
