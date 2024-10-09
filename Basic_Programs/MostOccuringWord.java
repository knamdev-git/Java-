import java.util.Scanner;

public class MostOccuringWord {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    //Taking input of a string 
    String word = scan.nextLine();

    int letterCount =  1 , count = 1 ;
    char repeatedLetter = ' ';

    word.toLowerCase();
    //from 0 to length of a string we'll compare word to another 
    for (int i = 0; i < word.length(); i++) {

      char currentChar = word.charAt(i);

      for (int j = i+1; j < word.length(); j++) {
       
        if (word.charAt(j) == currentChar) {
              count++ ;
        }
      }

      //udating the repeating character value : 
      if ((letterCount > count || letterCount == 1) && letterCount < word.length()){
        letterCount = count;
        repeatedLetter = currentChar;                        
      }
    }

    System.out.println(" Most repeated letter is : "+repeatedLetter+" at "+letterCount+" time");  
  }
}
