import java.util.*;

public class Password_strength_check {

    public static void main(String[] args) {
        //Prob : Password Check crcumtances code 
        System.out.println("\nPassword Check");

        //scanner class 
        Scanner scan = new Scanner(System.in);

        System.out.println("\nEnter your Password ");
        String password = scan.nextLine();

        Boolean passlen = false;
        Boolean passUper = false;
        Boolean passSpec = false;
        Boolean passdigi = false ;

        if (password.length() >= 8) {
          passlen = true;
        }

        for (int i = 0; i < password.length(); i++) {
         char ch = password.charAt(i);
        
         if (Character.isDigit(ch)) {
              passdigi = true ;      
         }
         else if (Character.isUpperCase(ch)) {
              passUper = true ;
         }
         else if (Character.isLetterOrDigit(ch)) {
              passSpec = true ;
         }
        }

        if (passSpec && passUper && passdigi && passlen){
          System.out.println("Your password is Strong ");
        }
        else{
          System.out.println("Your Password is Weak . \nMake sure it meets all the criteria !!");
        }

    }
}