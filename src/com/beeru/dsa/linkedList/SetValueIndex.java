package com.beeru.dsa.linkedList;

class  LinkedList6
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
    public  LinkedList6(int value )
    {
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length++;
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
    public  void prepend(int value)
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
    }
    public Node get(int index)
    {
        Node temp=head;
        if (index<0||index>=length)
        {
            return null;
        }
        for ( int i=0; i<index;i++)
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
        return false;
    }
}
public class SetValueIndex
{
    public static void main(String[] args) {
      LinkedList6 linkedList6=new LinkedList6(0);
      linkedList6.append(1);
      linkedList6.prepend(3);
      linkedList6.set(0,2);
      linkedList6.printList();

    }
}
