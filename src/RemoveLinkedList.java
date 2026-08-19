class  LinkedList2
{
    private Node head;
    private Node tail;
    private int length;
    class Node
    {
        int value;
        Node next;
        Node(int value)
        {
            this.value=value;
        }
    }
    LinkedList2 (int value )
    {
        Node linkedList=new Node(value);
        head=linkedList;
        tail=linkedList;
        length=1;
    }
    public void printLinkedList()
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
        System.out.println("head: "+head.value);
    }
    public void getTail()
    {
        System.out.println("tail:  "+tail.value);
    }
    public void getLength()
    {
        System.out.println("length: "+length);
    }
    public  void append(int value)
    {
        Node newList=new Node(value);
        if (length==0)
        {
            head=newList;
            tail=newList;
        }
        else
        {
            tail.next=newList;
            tail=newList;
        }
        length++;
    }
public Node removeList()
{
    if (length==0)
    {
        return  null;
    }
    Node temp=head;
    Node pre=head;
    while (temp.next !=null)
    {
        pre=temp;
        temp=temp.next;
    }
    tail=pre;
    tail.next=null;
    length--;
    if (length==0)
    {
        head=null;
        tail=null;
    }
    return temp;
}
}
public class RemoveLinkedList
{
    public static void main(String[] args) {
LinkedList2 linkedList=new LinkedList2(4);
linkedList.append(1);
       System.out.println(linkedList.removeList().value);
       //System.out.println(linkedList.removeList());
        //System.out.println(linkedList.printLinkedList());
        //System.out.println(linkedList.printLinkedList());
       // linkedList.printLinkedList();
    }
}
