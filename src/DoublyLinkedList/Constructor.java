package DoublyLinkedList;
class LinkedList
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
    public  LinkedList(int value)
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
    public void getHead()
    {
        System.out.println("head:"+head.value);
    }
    public void getTail()
    {
        System.out.println("tail:"+tail.value);
    }
    public void getLength()

    {
        System.out.println("length:"+length);
    }
}
public class Constructor
{
    public static void main(String[] args) {
LinkedList linkedList=new LinkedList(0);
linkedList.printList();
linkedList.getHead();
linkedList.getTail();
linkedList.getLength();
    }
}
