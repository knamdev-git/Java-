import java.util.Scanner ;

class palindrome{
	//driver code 
	public static void main(String[] args) {
		
		/*
		Algorithm for palindrome : 
				1. First take the number by making the scanner object
				2. reverse the number 
				3. if reverse number is equal to the orginal number then it is palindrome then not 
				4. Close Scanner object 
		*/

		Scanner s = new Scanner(System.in); //creating the obj for dynamic value
		int orgNum = s.nextInt(); // 1step
		int num = orgNum ;
		int revNum = 0 ;

		while( orgNum != 0 ){
			revNum = revNum*10 + (orgNum%10);
			orgNum /= 10 ;	 
		}

		if (num == revNum) {
				System.out.println("It's a Palindrome");
			}
		else{
				System.out.println("Not a Palindrome Number");
		}

		s.close();	
	}
}