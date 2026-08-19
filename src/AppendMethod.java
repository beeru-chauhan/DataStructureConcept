 class LinkedList1
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
    LinkedList1 (int value )
    {
        Node linkedList=new Node(value);
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
        Node newList=new Node(value);
        if (length==0)
        {
            head=newList;
            tail=newList;
        }
        else
        {
            tail.next=newList;
            tail=newList;
        }
        length++;
    }

}  
public class AppendMethod
{
    public static void main(String[] args) {
        LinkedList1 linkedList=new LinkedList1(4);
        linkedList.append(1);
        linkedList.getHead();
        linkedList.printLinkedList();
        linkedList.getTail();
        linkedList.getLength();
    }
}
