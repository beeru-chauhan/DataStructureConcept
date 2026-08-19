package queues.DSA;
class Queue1
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
public  Queue1(int value)
{
    Node newNode=new Node(value);
    first=newNode;
    last=newNode;
    length=1;
}
public  void  enQueue(int value)
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
public void printList()
{
    Node temp=first;
    while (temp!=null)
    {
        System.out.println(temp.value);
        temp=temp.next;
    }
}
}
public class EnQueue
{
    public static void main(String[] args) {
        Queue1 myQueue=new Queue1(0);
        myQueue.enQueue(1);
        myQueue.printList();
    }
}
