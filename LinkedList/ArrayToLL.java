//https://www.geeksforgeeks.org/problems/introduction-to-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=introduction-to-linked-list
import org.w3c.dom.Node;

public class ArrayToLL{

    static Node constructLL(int arr[]) {
        // code here
    
    
     // Function to construct a linked list from the given array and return the head of the linked list.  // If the array is empty, return null (no linked list to construct)
        if (arr.length == 0) {
            return null;
        }

        // Create the head of the linked list using the first element of the array
        Node head = new Node(arr[0]);
        Node current = head;

        // Iterate through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Create a new node for each element and link it to the current node
            current.next = new Node(arr[i]);
            // Move the current pointer to the new node
            current = current.next;
        }

        // Return the head of the constructed linked list
        return head;
    }
    
        
}

