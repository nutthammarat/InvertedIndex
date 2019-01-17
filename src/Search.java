
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
class Search
{
    Node head;    //Head of list

    //Inserts a new node at the front of the list
    public void push(int new_data)
    {
        //Allocate new node and putting data
        Node new_node = new Node(new_data);

        //Make next of new node as head
        new_node.next = head;

        //Move the head to point to new Node
        head = new_node;
    }

    //Checks whether the value x is present in linked list
    public boolean search(Node head, int x)
    {
        Node current = head;    //Initialize current
        while (current != null)
        {
            if (current.data == x)
                return true;    //data found
            current = current.next;
        }
        return false;    //data not found
    }
}
