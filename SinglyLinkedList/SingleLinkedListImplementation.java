
public class SinglyLinked {
	
	//creating node in java
    class Node {
        int data;
        Node next;

        //constructor to initialize the node
        public Node(int d) {
            this.data = d;
            this.next = null;
        }
        
        
    }

    //we head node and initialize to null
    public Node head = null;

    //adding node to head
    public Node addNode(int d) {
        if (head == null) 
        {
            head = new Node(d);
        } 
        else 
        {
            Node temp = head;
            while (temp.next != null) 
            {
                temp = temp.next;
            }
            temp.next = new Node(d);
        }
        // Return the head of the linked list after adding the node
        return head;
    }

    public void display() 
    {
        Node temp = head;
        if (temp == null) {
            System.out.println("LinkedList is Empty");
        } else {
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null"); // Add a newline to separate the output visually
        }
    }


    public static void main(String[] args) 
    {
        SinglyLinked lst = new SinglyLinked();
        
        Node head = null;
        lst.addNode(1);
        lst.addNode(2);
        lst.addNode(3);
        lst.addNode(4);
        lst.addNode(5);
        lst.addNode(6);

       

        // Display the entire linked list starting from the head
        lst.display();
    }
}
