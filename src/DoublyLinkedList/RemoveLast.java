package DoublyLinkedList;
class DoublyLinkedList
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
    public  DoublyLinkedList(int value)
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
    public Node removeLast()
    {
        Node temp=tail;
        if (length==0)
        {
            return null;
        }
        if (length==1)
        {
            head=null;
            tail=null;
        }
        else
        {

            tail=temp.prev;
            tail.next=null;
            temp.prev=null;
        }
        length--;
        return temp;
    }

}
public class RemoveLast
{
    public static void main(String[] args) {
DoublyLinkedList doublyLinkedList=new DoublyLinkedList(0);
doublyLinkedList.append(1);
        System.out.println(doublyLinkedList.removeLast().value);
        System.out.println(doublyLinkedList.removeLast().value);
        System.out.println(doublyLinkedList.removeLast());
    }
}
