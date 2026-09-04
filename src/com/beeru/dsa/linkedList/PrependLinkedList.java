package com.beeru.dsa.linkedList;

class LinkedList3
{
    Node head ;
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
    public LinkedList3(int value)
    {
        Node node=new Node(value);
        head=node;
        tail=node;
        length=1;
    }
    public void printList( )
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
            tail=newNode;
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
        else {
           newNode.next=head;
           head=newNode;
        }
        length++;
    }
}
public class PrependLinkedList
{
    public static void main(String[] args) {
LinkedList3 linkedList=new LinkedList3(5);
linkedList.append(1);
linkedList.prePend(3);
linkedList.printList();
//linkedList.prePend(3);
    }
}
