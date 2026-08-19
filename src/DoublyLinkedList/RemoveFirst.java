package DoublyLinkedList;
class DoublyLinkedList2
{
    Node tail;
    Node head;
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
    public DoublyLinkedList2(int value)
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
    public  void printList()
    {
        Node temp=head;
        while (temp!=null)
        {
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public Node removeFirst()
    {
        if (length==0)
        {
            return null;
        }
        Node temp=head;
        if (length==1)
        {
            head=null;
            tail=null;
        }
        else
        {
            head=head.next;
            temp.next=null;
            head.prev=null;
        }
        length--;
        return temp;
    }
}
public class RemoveFirst
{
    public static void main(String[] args) {
DoublyLinkedList2 doublyLinkedList2=new DoublyLinkedList2(0);
doublyLinkedList2.append(1);
doublyLinkedList2.prePend(2);
//doublyLinkedList2.printList();
        System.out.println(doublyLinkedList2.removeFirst().value);
        System.out.println(doublyLinkedList2.removeFirst().value);
        System.out.println(doublyLinkedList2.removeFirst().value);
        System.out.println(doublyLinkedList2.removeFirst());
    }
}
