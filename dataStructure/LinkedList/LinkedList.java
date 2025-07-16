

class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }


    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList{
    public static void main(String[] args) {
        Node  newnode = new Node(2);

        // if we want to convert array to Linkedlist 
        int[] arr = {2,1,3,5};

        convertArrtoLL(arr);
    }

    private static void convertArrtoLL(int[] arr) {
        // arr the first index always store at first head of the node of the LL
        Node head = new Node(arr[0]);
        Node mover = head;
        int count = 1;
        
        // System.out.println(head.data+" -> "+head.next);
        for(int i = 1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            System.out.print("["+mover +" "+mover.data+" "+mover.next+"] "); // this will be show the proper address and data inside the node and pointing to the next class 
            mover = temp;
            count++;
        }
            System.out.print("["+mover.data+" "+mover.next+"] ");


    }
    
}