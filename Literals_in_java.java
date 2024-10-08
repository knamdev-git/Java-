
public class Main
{
	public static void main(String[] args) {

	//Lliterals are the fixed values that are directly represented in the source code. These values are assigned to variables or used directly in expressions. They are the simplest form of expressions and represent data directly without the need for computation.
	//float literals 
	
	double a= 23.456f ; // here 23.456f is literal example , 1 Type 
 	System.out.println(a);//23.4599937438965
	
	float b = (float)23.456d ; // another type of literal "23.456d"
	System.out.println(b); //23.456
	
	double c = b ;
	System.out.println(c); //23.4599937438965
	
	
	//Integer Literals
	
	int d = (int)35L ; // no change in data but size will occupy 8 byte
	long e = 35 ; // size : 8 Byte 
    short f = 65 ; // size : 2 byte
	int gh = 35 ; // size : 4 byte
	int g = (short)35 ; // size : 2 byte
    
    //	int i = 35S ; // standardly it is a integer but by literal use it will consider as "Short" size : 2 byte 
	
	System.out.println(f);
    System.out.println(gh);
    System.out.println(g);

	}
}
