class LinkedList7
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
          this .value=value;
      }
    }
    public LinkedList7(int value)
    {
        Node newNode=new Node(value);
        head =newNode;
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
        for (int i=0;i<index;i++)
        {
            temp =temp.next;
        }
        return temp;
    }
    public boolean set(int index,int value)
    {
        Node temp=get(index);
        if (temp!=null)
        {
            temp.value=value;
            return true;
        }
        return  false;
    }
    public boolean insertF(int index,int value)
    {
        Node newNode=new Node(value);
        if (index<0||index>=length)
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
            return  true;
        }
        Node temp=get(index-1);
        newNode.next=temp.next;
        temp.next=newNode;
        length++;
                return true;
    }
}
public class IsertNode
{
    public static void main(String[] args) {
LinkedList7 linkedList7=new LinkedList7(0);
//        System.out.println(linkedList7.get(2).value);
linkedList7.append(1);
linkedList7.prePend(2);
linkedList7.set(0,4);
linkedList7.insertF(1,8);
       // System.out.println(linkedList7.get(2).value);
linkedList7.printList();
    }
}
