public class SplitLinkedListAlternatingly {

    struct Node
    {
        int data;
        struct Node* next;

    Node(int x){
            data = x;
            next = NULL;
        }

    };

    // Function to append a new node with newData at the end of a linked list
    Node[] alternatingSplitList(Node head) {
        // code here
        if (head == null) {
            return null;
        }
        Node node1 = head;
        Node node2 = head.next;
    }
}
