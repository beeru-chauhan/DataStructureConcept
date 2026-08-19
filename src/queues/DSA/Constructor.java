package queues.DSA;
class Queue
{
  private    Node first;
    private Node last;
   private int length;
    class Node
    {
        Node next;
        int value;
        Node(int value)
        {
            this.value=value;
        }
    }
    public Queue(int value)
    {
        Node newNode=new Node(value);
        first=newNode;
        last=newNode;
        length=1;
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
    public void getFirst()
    {
        System.out.println("first: "+first.value);
    }
    public void getLast()
    {
        System.out.println("last:"+last.value);
    }
    public void getLength()
    {
        System.out.println("length: "+length);
    }
}
public class Constructor
{
    public static void main(String[] args) {
Queue myQueue=new Queue(0);
myQueue.getFirst();
myQueue.getLast();
myQueue.getLength();
myQueue.printList();
    }
}
