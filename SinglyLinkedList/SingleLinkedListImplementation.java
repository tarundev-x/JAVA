package Collection;

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

    // head node and initialize to null
    public Node head = null;

    
    //adding node to head
    public Node addNodeAtTail(int d) {
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
    public void Insertbegin(int d)
    {
    	Node temp=new Node(d);
    	temp.next=head;
    	head=temp;
    }

    public void InsertMiddle(int d)
    {
    	Node newNode=new Node(d);
    	int c=0;
    	Node temp=head;
    	while(temp!=null)
    	{
    		temp=temp.next;
    		c++;
    	}
    	temp=head;

    	for(int i=1;i<(c+1)/2;i++)
    	{
    		temp=temp.next;
    	}
    	newNode.next=temp.next;
    	temp.next=newNode;

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


    public boolean search(int d)
    {
    	Node temp=head;
    	while(temp.next!=null)
    	{
    		if(temp.data==d)
    		{
    			return true;
    		}
    		temp=temp.next;
    	}
    	return false;
    }
    public static void main(String[] args) 
    {
        SinglyLinked lst = new SinglyLinked();
        
        lst.addNodeAtTail(1);
        lst.addNodeAtTail(2);
        lst.addNodeAtTail(3);
        lst.addNodeAtTail(4);
        lst.addNodeAtTail(5);
        lst.addNodeAtTail(6);

        // Display the entire linked list starting from the head
        lst.display();
        //insert at begiing
        System.out.println("Inserting Element at the begining");
        lst.Insertbegin(10);
        lst.Insertbegin(11);
        lst.display();
        //searcing
       boolean ans= lst.search(5);
       System.out.println(ans!=true?"Element Not Found":"Element Found");
       
       System.out.println("Inserting Element at the Midddle of the linked list");
       lst.InsertMiddle(55);
       lst.display();
    }
}
