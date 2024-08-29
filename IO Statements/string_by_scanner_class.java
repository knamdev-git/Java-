/* 
There are three methods for Scanner class 
---> Scannner scan = new Scanner (String input);
---> Scannner scan = new Scanner (File file name);
---> Scannner scan = new Scanner (System.in);
*/ 

import java.util.Scanner ;

class String_input{
	public static void main(String[] args){
		// passing normal Dynamic input in Scanner class
		Scanner sc = new Scanner(System.in);
	
		System.out.println("\nEnter the variable in Integer form ");
		int var = sc.nextInt() ;
		System.out.println(var);
	}
}