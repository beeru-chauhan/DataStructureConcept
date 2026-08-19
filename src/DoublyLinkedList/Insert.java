package DoublyLinkedList;
class DoublyLinkedList5 {
    Node head;
    Node tail;
    int length;

    class Node {
        Node next;
        Node prev;
        int value;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList5(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
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
    public Node get(int index)
    {
        if (index<0||index>=length)
        {
            return null;
        }
        Node temp=head;
        if (index<length)
        {
            for (int i=0;i<index;i++)
            {
                temp=temp.next;
            }
        }
        else
        {
            temp=tail;
            for (int i=0;i>index;i--)
            {
                temp=temp.prev;
            }
        }
        return temp;
    }
    public boolean insert(int index,int value)
    {
        if (index<0||index>length)
        {
            return false;
        }
        if (index==0)
        {
            prePend(value);
            return true;
        }
        if (index==length)
        {
            append(value);
            return true;
        }
        Node newNode=new Node(value);
        Node temp=get(index-1);
        temp.next=newNode.prev;
        temp=temp.next;
        temp.prev=newNode.next;
        length++;
        return true;
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
}
public class Insert
{
    public static void main(String[] args) {
        DoublyLinkedList5 doublyLinkedList5=new DoublyLinkedList5(0);
        doublyLinkedList5.append(1);
        doublyLinkedList5.prePend(2);
        doublyLinkedList5.append(4);
        doublyLinkedList5.insert(1,10);
        doublyLinkedList5.printList();
    }
}
