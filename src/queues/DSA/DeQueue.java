package queues.DSA;
class Queue2
{
    Node first;
    Node last;
    int length;
    class Node
    {
        Node next;
        int value;
        Node(int value)
        {
            this.value=value;
        }
    }
    public  Queue2  (int value)
    {
        Node newNode=new Node(value);
        first=newNode;
        last=newNode;
        length=1;
    }
    public  void enQueue(int value)
    {
        Node newNode=new Node(value);
        if (length==0)
        {
            first=newNode;
            last=newNode;
        }
        else
        {
            last.next=newNode;
            last=newNode;
        }
        length++;
    }
    public Node deQueue()
    {
        if (length==0)
        {
            return null;
        }
        Node temp=first;
        if (length==1)
        {
            first=null;
            last=null;
        }
        else {
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }
    public  void printList()
    {
        Node temp=first;
        while (temp!=null)
        {
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
}
public class DeQueue
{
    public static void main(String[]args)
    {
Queue2 myQueue=new Queue2(0);
myQueue .enQueue(1);
myQueue.enQueue(2);
myQueue.deQueue();
myQueue.printList();
    }
}
