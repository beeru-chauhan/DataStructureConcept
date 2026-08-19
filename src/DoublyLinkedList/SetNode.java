package DoublyLinkedList;
class DoublyLinkedList4
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
    public DoublyLinkedList4(int value)
    {
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
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
    public Node get(int index)
    {
        Node temp=head;
        if (index<length/2)
        {
            for (int i=0;i<index;i++)
            {
                temp=temp.next;
            }
        }
        else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.next;
            }
        }
        return temp;
    }
    public boolean set(int index,int value)
    {

           Node temp = get(index);
           if (temp!=null) {
               temp.value = value;
               return true;
           }
           return false;

    }
}
public class SetNode
{
    public static void main(String[] args) {
DoublyLinkedList4 doublyLinkedList4=new DoublyLinkedList4(0);
doublyLinkedList4.append(1);
doublyLinkedList4.prePend(2);
doublyLinkedList4.set(0,10);
doublyLinkedList4.printList();
        System.out.println(doublyLinkedList4.get(0));

    }
}
