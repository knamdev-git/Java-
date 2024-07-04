import java.util.Scanner;

public class functions_topic {
   
    static double pie = 3.1415926 ;
    //print name simple function 
    
    public static void printMyName(String name){
    
        System.out.println("Hello "+name+"!");
    
        return;
    
    }
   
    //Number is prime or not 
    
    public static void Check_prime(int num){
        if (num == 2 || num == 3 || num == 5 || num == 7 ){
            System.out.println("Yes ! It's a Prime number ");
        }
        else if(num % 2 == 0|| num % 3 == 0 || num % 5 == 0 || num % 7  ==0  ) {
            System.out.println("It's not a prime number");
        }
        else{
            System.out.println("It's a prime number ");
        }
    }
    
    //Factorial of a given number
    
     public static int factorial(int num , int mul){
    
        //Factorial of -ve numbers is not valid so 
    
        if (num < 0 ) {
            System.out.println("Invalid Number \n");
            return 0;
        }
    
        for (;  num >= 1; num--) {
            mul = mul * num ;
        }
    
        return mul ;
    
    }


    
    //Driver Code 
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
    
        //the return type of printMyName fun is Void it doesn't retrn anything just perform the operation 
    
        System.out.println("What is Your Good Name -> ");
    
        String name = scan.nextLine();
    
        printMyName(name);
    
        
    
        // "int" function return something and store the value in "Sum" Variable
    
        System.out.println("Enter two Numbers ");
    
        int num1 = scan.nextInt();
    
        int num2 = scan.nextInt();
        
        System.out.println("Your Sum is "+AddTwoNum(num1, num2));
 
        //factorial 
    
        System.out.println("Enter Number for Factorial ");
    
        int fac_num = scan.nextInt();
    
        int mul = 1;

        // res = result 
    
        System.out.println("Factorial is "+ factorial(fac_num , mul));
        
        System.out.println("Enter number : ");
        int prime_number = scan.nextInt();

        //Function call : prime or not 
        Check_prime(prime_number);

        //String reverse 
        // System.out.println("Enter string : ");
        // String sentence = scan.nextLine();
       
       //func call
        //string_reverse(sentence);

        //functions to calculate the area of a rectangle and a circle
        cal_Area_of_rec_circle(scan);
        
        //
        System.out.println("<--Sum of its elements-->\nEnter a digit ");
        int a_num = scan.nextInt();
        
        int cal_sum_its_ele = sumOfItsElem(a_num);
        
        //printing sum of it's element by the help of function 
        System.out.println("It's element sum is " +cal_sum_its_ele);
        
        // code for odd number sum
        System.out.println("<-- Sum of Odd Number -->");
        int od_num = scan.nextInt();
        sumOfAllOddNum(od_num);    
    
        scan.close();
    }//end of main class 
    
    //sum of all odd number 

    public static void sumOfAllOddNum(int n){ // n means number
        int i = 0 ;
        int odd_sum = 0;

        while (i != n ) {
            
            i++;

            if(i%2 != 0 || i == n){
                odd_sum = odd_sum + i ;
            }
        
        }

        System.out.println("Sum upto " +n+ " number is " +odd_sum);
    }
   //sumOfItsElem
   
   public static int sumOfItsElem ( int num ){
   
        int sum = 0;
        while (num != 0) {
            int rem = num % 10 ;
            sum  =  rem + sum ;
            num /= 10 ;
        }
        return sum;
   
    }

    //function of calucalte area of rec 
    
    public static void cal_Area_of_rec_circle(Scanner scan){
        double length , breadth , radius ;
        
        System.out.println("<--Rectangle--> \nEnter the Length and breadth ");
        
        length = scan.nextDouble();
        breadth = scan.nextDouble();
        
        System.out.println("Area of Rectangle : "+(length*breadth));
        
        //calculate Area of Circle 
        System.out.println("<--Circle-->\nEnter the Radius ");
        radius = scan.nextDouble();
        
        System.out.println("Area of a Circle : "+ (pie*radius*radius));
    }

   //function to reverse the string 
    
   public static void string_reverse(String sentence){
        System.out.println(sentence.charAt(0) );
        return;
    }

    //functions to "Add Sum"
   
    public static int AddTwoNum(int num1 , int num2){
       return (num1 + num2);
    }

}//end of function_class 
