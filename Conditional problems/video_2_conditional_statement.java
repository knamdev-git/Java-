/*Conditional Keywords 
if , else
else , if
switch 
break 
*/

import java.util.Scanner;
public class video_2_conditional_statement
{
    // We also remined that the program does not run without main class

  //if else 
    public static void main(String[] args) 
  {
            // scanner class 

            Scanner scan = new Scanner(System.in);

          // taking input in num 

                
   // Check num1 is gretaer then 18 or not
   System.out.println("Check Adult or not ");
            int age = scan.nextInt(); 
            if( age > 18 ){
               System.out.println("You are an adult");
             }    
             else {
               System.out.println("Not Adult");
             }    
             
   //prob 2 : if - else   
   System.out.println("Number is Even or Odd ");  
           int num = scan.nextInt();
           if(num % 2 == 0 ){
             System.out.println("Even Number ");
           }
           else{
             System.out.println("Odd Number ");
           }

   //Prob : 3 check number is greater or equal to 
         int num1 , num2 ;
System.out.println("Number Comparision");
         num1 = scan.nextInt();
         num2 = scan.nextInt();  
         if (num1 == num2) {
           System.out.println("Both Numbers are Equal ");
         }
         else if (num1 > num2){
           System.out.println("First Number is greater");
         }
         else{
           System.out.println("Second Number is greater");
         }
   // prob 3 : (Print the Greeting )
   //According to option the robot says us : 1 -> hello , 2 -> Namaste , 3 -> Bonjour
          System.out.println("According to option the robot says us : 1 -> hello , 2 -> Namaste , 3 -> Bonjour");
          System.out.println("Enter Any Option");
          int button = scan.nextInt(); // button = option 
          switch (button) {
           case 1:
             System.out.println("Hello");
             break;
           case 2:
             System.out.println("Namaste");       
             break;    
           case 3:
             System.out.println("Bonjour");      
             break;   
           default:
           System.out.println("Invalid Button !!");
             break;
          }
   /* Homework
          Make a calculator has 'a' and 'b' : 
           For addition + 
           For Substraction -
           .. and so on 
   */   int a ,b;   
  //       System.out.println("Enter two numbers for Calculator ");
System.out.println("Calculator ");
        a = scan.nextInt();
        //charAt is a method 
        char sign = scan.next().charAt(0);
        b = scan.nextInt();
          
          
        //switch case for sign + , - , / , % 
        switch (sign) {
          case '+':
            System.out.printf(" Sum is : %d" , a + b);
            break;

          case '-' :
            System.out.printf("Substraction is  : %d"  ,a-b);
            break;
          case '/' :
            System.out.printf("Division is :  "+ a/b);
            break;
          case '%' :
            System.out.printf("Reminder is : "+ a%b);  
            break;
          
          case '*':
            System.out.printf("Multiplication is : " + a*b );
            break;
        
          default:
          System.out.println("Not valid ! ");
            break;
        }
      
//prob 2 . Ask User to enter the number of the month and print the name of the month
System.out.println("\nMonth Return");
        System.out.println("Enter Number of Month ");
        int month = scan.nextInt();

        switch (month) {
            case 1:
            System.out.println("January");
            break;
          
            case 2:
            System.out.println("February");
            break;
        
            case 3:
            System.out.println("March");
            break;

            case 4:
            System.out.println("April");
            break;

            case 5:
            System.out.println("May");
            break;

            case 6:
            System.out.println("June");
            break;

            case 7:
            System.out.println("July");
            break;

            case 8:
            System.out.println("August");
            break;

            case 9:
            System.out.println("September");
            break;
            
            case 10:
            System.out.println("October");
            break;

            case 11:
            System.out.println("November");
            break;

            case 12:
            System.out.println("December");
            break;

          default:
          System.out.println("No Month Exist : Greater than 12 !");
            break;
        }

// Prob 3 : checking the Particular Roots of each Quadratic Equation

        System.out.println("Enter Coeficients : a , b & c ");
        float cofi_a = scan.nextFloat();
        float cofi_b = scan.nextFloat();
        float cofi_c = scan.nextFloat();
        
        //The equation looks like : (a)x^2 + (b)x + c = 0 
        
        Double dell = Math.pow(cofi_b , 2) - (4 * cofi_a * cofi_c);
        
        // Dell = b^2 - 4ac 
        //Here Dell is Discriminant it means : It  helps determine the nature and number of solutions (roots) of the quadratic equation.

        if (dell > 0) {
          System.out.println("The equation has two distinct real roots.");
        }
        else if (dell == 0) {
          System.out.println("The equation has exactly one real root (a repeated root)");
        }
        else{
          System.out.println("The equation has two complex (imaginary) roots");
        }

// Prob 4 : Leap Year or not 
System.out.println("\nLeap Year");
        System.out.println("Enter Year : ");
        int year = scan.nextInt();

        if (year % 4 == 0) {
          System.out.printf("%d is Leap Year" ,year);
        }
        else if (year % 400 == 0) {
          System.out.printf("%d is Leap Year" ,year);
        }
        else if (year % 100 == 0 ) {
          System.out.printf("%d is Leap Year" , year); 
        }
        else{
          System.out.printf("%d is Not a Leap Year",year);
        }        
        

//Prob 6 : Traffic light color 
        System.out.println("\nTraffic light color ");
        System.out.print("Enter Color Name : ");
        String currentcolor = scan.nextLine();

        String nextcolor = "";

        if(currentcolor.equals("red")){
          nextcolor = "Green" ;
        }
        else if (currentcolor.equals("green")) {
          nextcolor = "Yellow" ;
        }
        else if (currentcolor.equals("yellow")) {
          nextcolor = "Red" ;
        }
        else
        {
          System.out.println("Invalid color name");
        }

        System.out.println("Next color is "+nextcolor);
  }//end of main class   
}
