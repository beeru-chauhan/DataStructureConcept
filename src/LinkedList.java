public class LinkedList
{
    private Node head;
    private Node tail;
    private int length;
    class Node
    {
        int value;
        Node next;
        Node(int value)
        {
            this.value=value;
        }
    }
    LinkedList (int value )
    {
        Node linkedList=new Node(4);
        head=linkedList;
        tail=linkedList;
        length=1;
    }
    public void printLinkedList()
    {
Node temp=head;
while (temp!=null)
{
    System.out.println(temp.value);
    temp=temp.next;
}
    }
    public void getHead()
    {
        System.out.println("head: "+head.value);
    }
    public void getTail()
    {
        System.out.println("tail:  "+tail.value);
    }
    public void getLength()
    {
        System.out.println("length: "+length);
    }
    public  void append(int value)
    {
        Node newList=new Node(1);
        if (length==0)
        {
            tail.next=newList;
            tail=newList;
        }
        else
        {
            tail.next=newList;
            tail=newList;
        }
    }

}
