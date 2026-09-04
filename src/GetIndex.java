class  LinkedList5
{
    Node head;
    Node tail;
    int length;
    class Node
    {
        Node next;
        int value;
        Node (int value)
        {
            this.value=value;
        }
    }
    public LinkedList5(int value)
    {
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length++;
    }
    public void append(int value)
    {
        Node newNode=new Node(value);
        if (length==0)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.next=newNode;
            tail=newNode;
        }
length++;
    }
    public void printList()
    {
        Node temp=head;
        while (temp!=null)
        {
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public void prepend(int value)
    {
        Node newNode=new Node(value);
        newNode.next=head;
        head=newNode;
        length++;
    }
    public Node get(int index)
    {
        if (index<0||index>=length)
        {
            return null;
        }
        Node temp=head;
        for (int i=0; i<index;i++)
        {
temp=temp.next;
        }
        return temp;
    }
}
