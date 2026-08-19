package stack;
class Stack2
{
    Node top;
    int height;
    class Node
    {
        Node next;
        int value;
        Node(int value)
        {
            this.value=value;
        }
    }
    public Stack2 (int value)
    {
        Node newNode=new Node(value);
        top=newNode;
        height=1;
    }
    public void push(int value)
    {
        Node newNode=new Node(value);
        if (height==0)
        {
            top=newNode;
        }
        else
        {
            newNode.next=top;
            top=newNode;
        }
        height++;
    }
    public Node pop()
    {
        if (height==0)
        {
            return null;
        }
        Node temp=top;
        top=top.next;
        temp.next=null;
        return temp;
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
}
public class Pop
{
    public static void main(String[] args) {
        Stack2 myStack=new Stack2(0);
        myStack.push(1);
        myStack.push(2);
        myStack.pop();
        myStack .printStack();
    }
}
