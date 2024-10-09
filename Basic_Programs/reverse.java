import java.util.Scanner ;

class reverse{
	//main function
	public static void main(String args[]){
		//Scanner class object initialization 
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt(); //4321
		
		//loop until the number goes 0
		int reverse_number = 0;
		
		while(num != 0){
			reverse_number = reverse_number * 10 + (num % 10); // 0*10 + 1 = 1 , 1*10 + 2 = 12... so on 	
			num /= 10 ; //432
		}
		
		System.out.println("Reverse Number is : "+reverse_number);
		//close the scanner 
		scan.close();
	}
}