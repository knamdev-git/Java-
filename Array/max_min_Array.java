import java.util.Scanner ;

public class max_min_Array{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        // program starts 
        // we have to find the greatest number from entered array by user 
        int size = scan.nextInt();

        int[] Array = new int[size] ;

        // for loop : for taking the element in array 
        for (int i = 0; i < Array.length; i++) {
            System.out.println("Enter "+(i+1)+" element of array ");
            Array[i] = scan.nextInt();
        }

        //initialise a variable before comparision 
        int value = 0 ;

        int i = 0 ;

        //searching Maximum value in array 
        while(i  < (Array.length)-1) {
           
            if(Array[i] >= Array[i+1]){
                
                if(Array[i] > value){
                    value = Array[i] ;
                }
            }
            else{
                value = Array[i+1];
            }      
            i++ ;      
        }

        System.out.println("The Greatest Element in array is "+value);
        
        value = 0 ; i = 0 ;
        //Finding the minimum value in array 
        while(i  < (Array.length)-1) {
           
            if(Array[i] <= Array[i+1]){
                
                if(Array[i] < value){
                    value = Array[i] ;
                }
            }
            else{
                value = Array[i+1];
            }      
            i++ ;      
        }
        
        System.out.println("Minimum Element in array is "+value);
        
        //Space and Time complexity are O(n)
        scan.close();
    }   
}