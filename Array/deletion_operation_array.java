import java.util.Scanner ; 

class deletion_operation_array{
   
    // function to return the index of the array and we start loop from there 
    public static int index( int[] array , int delete ){
         
        // for array for traverse particular element and delete from the array 
         for (int i = 0; i < array.length; i++) {
            if (delete == array[i])
                    return i;              
        }
        
        System.out.println("No elements found");
        return 0;
    }

    public static void main(String[] args) {
        //arraydeletion

        Scanner s = new Scanner(System.in);

        //1 initialise an array 
        int[] array = new int[5] ;

        System.out.println("Enter the elements in the array ");

        for(int i = 0 ; i < array.length ; i++){
            array[i] = s.nextInt();
        } // taking elements in the array

        System.out.println("Delete element : ");
        int delete = s.nextInt(); //54

        int i = index(array, delete);

        System.out.println("Element found at index : "+(i+1));
        
        for (int j = i; j < array.length-1; j++) {
            array[j] = array[j+1];
        }

        int length = array.length-1;

        if (i == array.length-1) {
            length = array.length-1 ;
        }

        for (int j = 0; j < length; j++) {  
            System.out.print(array[j]+" ");
        }
        
        s.close();
    }
}