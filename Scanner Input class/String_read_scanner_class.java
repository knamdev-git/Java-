import java.util.Scanner ; 

public class String_read_scanner_class
{
	public static void main(String[] args) {
    
	 // like scanner obj 
	 String s = "My name is XYZ and I acheived 90 % in 12 th";
	 
	 Scanner sc = new Scanner(s);
	 
	 boolean b = sc.hasNext() ; // hasNext() is a method which shows "True" : When the element present in a string , "False" : When token isn't present in a string
	 
	 while(b == true){
	     if(sc.hasNext() == false){
	         break ;
	     }
	     System.out.print(" "+sc.next());
	      
	 }
       
	}
}