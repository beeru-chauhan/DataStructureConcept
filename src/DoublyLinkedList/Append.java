package DoublyLinkedList;
class LinkedList1
{
    Node head;
    Node tail;
    int length;
    class Node
    {
        int value;
        Node next;
        Node prev;
        Node(int value)
        {
            this.value=value;
        }
    }
    public LinkedList1(int value)
    {
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
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
    public  void append(int value)
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
            newNode.prev=tail;
            tail=newNode;
        }
        length++;
    }
}
public class Append
{
    public static void main(String[] args)
    {
LinkedList1 linkedList1=new LinkedList1(0);
linkedList1.append(1);
linkedList1.printList();
    }
}
