import java.util.*;

// public class LinkedList<T> {
//     Node head;

//     // Node class to store data and the next node reference
//     class Node {
//         T data;
//         Node next;

//         Node() {
//             data = null;
//             next = null;
//         }

//         Node(T d) {
//             data = d;
//             next = null;
//         }
//     }

//     // LinkedList constructor
//     LinkedList() {
//         head = new Node(); // Initializing the head node
//     }

//     // Method to insert a node at the front
//     public void insertFront(T data) {
//         Node newNode = new Node(data);
//         newNode.next = this.head.next;
//         this.head.next = newNode;
//     }

//     // Method to insert a node at the end
//     public void insertEnd(T data) {
//         Node newNode = new Node(data);
//         Node temp = this.head;
//         while (temp.next != null) {
//             temp = temp.next;
//         }
//         temp.next = newNode;
//     }

//     // Displaying the linked list data
//     public void display() {
//         Node temp = head.next; // Start from the first data node
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
//     public void insertKey(T data,T key)
//     {
//         Node newNode = new Node(data);
//         Node temp =head;
//         boolean status = false;
//         while(temp.next != null)
//         {
//             if(temp.data == key)
//             {
//                 status  = true;
//                 break;
//             }
//             temp = temp.next;
//         }
//         if(status)
//         {
//             newNode.next = temp.next;
//             temp.next = newNode;
//         }
//     }
//     public void deleteKey(T key)
//     {
//         Node temp = head;
//         boolean status = false;
//         while(temp != null)
//         {
//             if(temp.next.data == key)
//             {
//                 status = true;
//                 break;
//             }
//             temp = temp.next;
//         }
//         if(status)
//         {
//             temp.next = temp.next.next;
//         }
//         System.out.println("Deleted succesfully");
//     }
    public static void main(String args[]) {
        int key;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the data you want to insert at the front:");
        int d = s.nextInt();

        // Creating a linked list of Integer type
        LinkedList<Integer> list = new LinkedList<>();

        // Inserting data at the front
        list.insertFront(d);

        System.out.println("Enter the data you want to insert at the end:");
        d = s.nextInt();

        // Inserting data at the end
        list.insertEnd(d);
        System.out.println("Enter the data you want to insert at the end:");
        d = s.nextInt();

        // Inserting data at the end
        list.insertKey(d,1);

        System.out.println("Enter the data you want to delete ::");
        key = s.nextInt();

        // Inserting data at the end
        list.deleteKey(key);
        // Displaying the linked list
        System.out.println("The linked list is:");
        list.display();
    }
}
