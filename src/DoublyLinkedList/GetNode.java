package DoublyLinkedList;
class DoublyLinkedList3
{
    Node head;
    Node tail;
    int length;
    class  Node
    {
        Node next;
        Node prev;
        int value;
        Node(int value)
        {
            this.value=value;
        }
    }
    public DoublyLinkedList3(int value)
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
    public void printList()
    {
        Node temp=head;
        while (temp!=null)
        {
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public void praPend(int value)
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
    public Node get(int index)
    {
       if (index<0||index>=length)
       {
           return null;
       }
       Node temp=head;
       if (index<length/2)
       {
           for (int i = 0; i < index; i++)
           {
               temp = temp.next;
           }
       }
       else
       {
           temp=tail;
           for (int i=length-1;i>index;i--)
           {

               temp=temp.prev;
           }
       }
       return temp;
    }
}
public class GetNode
{
    public static void main(String[] args) {
    DoublyLinkedList3 doublyLinkedList3=new DoublyLinkedList3(0);
    doublyLinkedList3.append(1);
    doublyLinkedList3.praPend(2);
    doublyLinkedList3.append(3);
    doublyLinkedList3.praPend(4);
    doublyLinkedList3.praPend(7);
    doublyLinkedList3.printList();
        System.out.println(doublyLinkedList3.get(5).value);
    }
}
