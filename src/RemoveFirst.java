import javax.print.attribute.standard.NumberOfInterveningJobs;

class LinkedList4
{
    Node head;
    Node tail;
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
    public LinkedList4(int value)
    {
        Node newNode=new Node(value);
        head =newNode;
        tail=newNode;
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
            Node temp=tail;
            temp.next=newNode;
            tail=newNode;
        }
    }
    public void prepend(int value)
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
            head=newNode;
        }
        length++;
    }
    public  Node removeFirst()
    {
        if (length==0)
        {
            return null;
        }
Node temp=head;
        head=head.next;
        temp.next=null;
        length--;
        if (length==0)
        {
            tail=null;
        }
        return  temp;
    }
    public Node removeLast()
    {
        if (length==0) {
        return null;
    }
    Node temp=head;
       Node pre=head;
       while (temp.next!=null)
       {
           pre=temp;
           temp=temp.next;
       }
       tail=pre;
       tail.next=null;
       length--;
       if (length==0)
       {
           tail=null;
           head=null;
       }
       return temp;
    }

}
public class RemoveFirst
{
    public static void main(String[] args) {
        LinkedList4 linkedList4=new LinkedList4(4);
        linkedList4.append(2);
        linkedList4.prepend(1);
       // System.out.println("the  first node is removed:"+ linkedList4.removeFirst().value);
        System.out.println(linkedList4.removeLast().value);
        System.out.println(linkedList4.removeLast().value                         );

       // linkedList4.printLinkedList();
        linkedList4.printLinkedList();
    }
}
