package DoublyLinkedList;
class DoublyLinkedList1
{
    Node head;
    Node tail;
    int length;
    class Node
    {
        Node next;
        Node prev;
         int value;
        Node(int value)
        {
            this.value=value;
        }
    }
    public DoublyLinkedList1(int value)
    {
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }
    public void append(int value)
    {
        Node newNode=new Node(value);
        if (length==0)
        {
            head =newNode;
            tail=newNode;
        }
        else
        {
         tail.next=newNode;
         newNode.prev=tail;
         tail=newNode;
        }

     ;   length++;
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
    public void prePend(int value)
    {
        Node newNode=new Node(value);
        if (length==0)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        length++;
    }
    public void printHead()
    {
        System.out.println(head.value);
    }
}
public class Prepend
{
    public static void main(String[] args) {
DoublyLinkedList1 doublyLinkedList1=new DoublyLinkedList1(0);
doublyLinkedList1.append(1);
doublyLinkedList1.prePend(2);
doublyLinkedList1.printList();
doublyLinkedList1.printHead();
    }
}
