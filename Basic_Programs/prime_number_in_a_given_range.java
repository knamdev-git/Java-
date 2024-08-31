import java.util.Scanner;

/**
 * prime_number_in_a_given_range
 */
public class prime_number_in_a_given_range {

  public static void print_prime(Scanner scan){
    
    System.out.println("Enter Starting Value : ");
    int start = scan.nextInt();

    System.out.println("Enter the limit : ");
    int limit = scan.nextInt();

    for (int i = start; i <= limit; i++) {
      if (i == 2 || i == 3 || i == 5 || i == 7) {
        System.out.print(i+" ");       
      }

      if ((i % 2 != 0) && (i % 3 != 0) && (i%5 != 0) && (i%7 != 0)) {
        System.out.print(i+" ");
      }
    }
  
  }

  public static void main(String[] args) {
    // for this range we should have to take two number 1 for start , 2 for limit

    Scanner scan = new Scanner(System.in);
    print_prime(scan);
  }
}