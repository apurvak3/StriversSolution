//https://www.geeksforgeeks.org/problems/linked-list-insertion-1587115620/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=linked-list-insertion

import org.w3c.dom.Node;

public class Insertion {
        // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // Create a new node with value x
        Node newNode = new Node(x);
        
        // If the linked list is empty, return the new node as the head
        if (head == null) {
            return newNode;
        }
        
        // Traverse to the end of the linked list
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        
        // Insert the new node at the end
        n.next = newNode;
        
        // Return the head of the modified list
        return head;
    }
    
}
