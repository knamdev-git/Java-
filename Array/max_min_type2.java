import java.util.Scanner;

public class max_min_type2 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("How many number you wanna insert : ");
        int N = s.nextInt();
        int[] arr = new int[N];

        System.out.println("Enter "+N+" elements : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
    
        //declare the max and min variable 
        int mx , min;
        mx = min = arr[0] ;

        for (int i = 0; i < arr.length; i++) {
            if (mx <= arr[i])
                mx = arr[i];
            
            if (min >= arr[i])
                min = arr[i];
            
        }

        System.out.println("Maximum value in array is : "+mx+"\nMin value of the array is : "+min);
    }
}
