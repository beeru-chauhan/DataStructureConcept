class LinkedList8
{
    Node head;
    Node tail;
    int length;
    class Node
    {
        Node next;
        int value;
        Node (int value)
        {
            this.value=value;
        }
    }
     public LinkedList8(int value)
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
     public void prepend(int value)
     {
         Node newNode=new Node(value);
         if (length ==0)
         {
             head=newNode;
             tail=newNode;
         }
         else
         {
             newNode.next=head;
             head =newNode;
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
             temp=temp.next;
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
public boolean insert(int index,int value)
{
    Node newNode=new Node(value);
    if (index <0||index>length)
    {
        return false;
    }
    if (index==0)
    {
        prepend(value);
        return true;
    }
    if (index==length)
    {
        append(value);
        return true;
    }
    Node temp=get(index-1);
    newNode.next=temp.next;
    temp.next=newNode;
    length++;
    return true;
}
public Node removeLast()
{
    if (length==0)
    {
        return null;
    }
    Node temp=head;
    Node pre;
    while (temp.next!=null)
    {
        temp=temp.next;
    }
    pre=temp;
            temp=temp.next;
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
public class RemoveInB
{
    public static void main(String[] args) {
        LinkedList8 linkedList8=new LinkedList8(0);
        linkedList8.append(1);
        linkedList8.prepend(2);
        System.out.println( linkedList8.get(1).value);
        System.out.println(  linkedList8.set(1,8));
        linkedList8.insert(2,33);
        linkedList8.removeLast();
        linkedList8.printList();
    }
}
