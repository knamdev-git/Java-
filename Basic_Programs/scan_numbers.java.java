import java.util.Scanner ;

class Test
{
	public static void check(int[] array){
		int positive , negative , zero ;
		positive = negative = zero = 0 ;
		
		//from 0 to n
		for(int i = 0 ; i < array.length ; i++){
			if (array[i] == 0)
				zero += 1 ;

			if (array[i] >= 0)
				positive += 1 ;
						
			if (array[i] < 0)
				negative += 1 ;
		}
		//Printing total count
		System.out.printf("\n Positive Numbers : %d \n Negative Numbers : %d \n Zero Numbers : %d",positive , negative , zero);

	}
	//Driver code
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int opt = 1 ;
			
		System.out.println("Enter Number ");
		// Starting literals variable
		int var = scan.nextInt();			
	
		System.out.println("\nDo you wanna Insert more numbers \n 0 : NO \n 1 : Yes");
		opt = scan.nextInt(); // 1
		
		int size_of_array = 0 ;
		
		if (opt == 1)
		{
			System.out.println("\nHow many Numbers you wanna insert ");
			size_of_array = scan.nextInt();
			
			if(size_of_array > 0){
				System.out.println("\nStart Entering ");
				int array [] = new int [size_of_array+1] ; // we'll need array after entering same type of data in it so ..
			
				// Save the var in the place of the array[0] and start loop from 1 
				array[0] = var ;
			
				for(int i = 1 ; i <= size_of_array ; i++){
					array[i] = scan.nextInt() ;
				}
				//Finally traverse the array from 0 to Size of the array and check Number of positive , Negative and Zero values 
				check(array) ;
			}
			else
				System.out.println("\nInserting Can't be Negative \nThanks");
		}
		else
			System.out.println((opt == 0) ? "\nStop Inserting" : "\nWrong Option");
		
		//close Scanner class object
		scan.close();
	}
}