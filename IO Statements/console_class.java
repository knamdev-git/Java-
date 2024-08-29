import java.io.Console ;

class console_class{
	static public void main ( String[] args){
		// console class : applicable for Stirng and character 
	Console c = System.console() ;

	String s =  c.readLine();

	System.out.println (s);
	}
}