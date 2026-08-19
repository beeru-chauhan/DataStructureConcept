package stack;
class  Stack
{
    private Node top;
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
    Stack(int value)
    {
Node newNode=new Node(value);
top=newNode;
height=1;
    }
    public void printList()
    {
        Node temp=top;
        while (temp!=null)
        {
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public void getTop()
    {
        System.out.println("top:"+top);
    }
    public void getHeigh()
    {
        System.out.println("height:"+height);
    }
}
public class Constructor
{
    public static void main(String[] args) {
Stack stack=new Stack(0);
stack.getHeigh();
stack.getHeigh();
stack.printList();

    }
}
