import java.io.*;

public class bufferreader_class_in_java {
  
  public static void main(String[] args) throws Exception 
  {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter the character ");
    int ch = bf.read();
    System.out.println("ASCII value : "+ch);
    System.out.println("Character value : "+(char)ch);
  
    bf.readLine();
    String c = bf.readLine();

    System.out.println("String value : "+c);

  }

  

  // OUTPUT
  /*-->  javac bufferreader_class_in_java.java

    -->  java bufferreader_class_in_java       
          Enter the character 
          a
         ASCII value :  97
         Character value : a 



    # Then we should have to use Typecasting for not changing the ASCII Value
  */
}
