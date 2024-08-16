import java.util.Scanner;

public class linear_search_TD_array {

	public static void main(String[] args) {


		int [][] array = new int [4][6];

		//scanner class
		Scanner scan = new Scanner (System.in);

		for (int row = 0; row <= 3 ; row++ ) {
			for (int col = 0; col <= 5 ; col++ ) {
				array[row][col] = scan.nextInt();
			}
		} //input taking loop

		//printing
		System.out.println("Value to search ");
		int value = scan.nextInt(); // define calue to search


		for (int row = 0; row <= 3 ; row++ ) {

			for (int col = 0; col <= 5 ; col++ ) {

				if (array[row][col] == value) {
					System.out.println("Found the value at "+row+","+col);
				}
				else {
					if((row == 3 && col == 5) && (array[row][col]!=value)) {
						System.out.println("No Element Found");
					}
					continue;
				}

			}
    }
  }
}