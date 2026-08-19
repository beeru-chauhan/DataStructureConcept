package stack;
class Stack1
{
 private    Node top;
 private    int height;
class Node
{
    Node next;
    int value;
    Node(int value)
    {
        this.value=value;
    }
}
public Stack1(int value)
{
  Node myStack=new Node(value);
  top=myStack;
  height=1;
}
public void printStack()
{
    Node temp=top;
    while (temp!=null)
    {
        System.out.println(temp.value);
        temp=temp.next;
    }
}
public void push(int value)
{
    Node newNode=new Node(value);
    if (height==0)
    {
        top=newNode;
    }
    else {
        newNode.next = top;
        top = newNode;
    }
    height++;
}
}
public class Push
{
    public static void main(String[] args) {
        Stack1 myStack=new Stack1(0);
        myStack.push(1);
        myStack.printStack();
    }
}
