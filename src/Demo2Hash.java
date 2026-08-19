import javax.print.DocFlavor;

class Hashtable
{
    private  int size=7;
    private Node []hashData;
    class Node
    {
        int value;
        String key;
        Node next;
        Node(String key,int value)
        {
            this.key=key;
            this.value=value;
        }
    }
    public Hashtable()
    {
        hashData=new Node[size];
    }
    public void printHash()
    {
        for (int i=0;i<hashData.length;i++)
        {
            System.out.println(i+": ");
            Node temp=hashData[i];
            while (temp!=null)
            {
                System.out.println(" {"+temp.key+"= "+temp.value+" }");
                temp=temp.next;
            }
        }
    }
}
public class Demo2Hash
{
    public static void main(String[] args) {
Hashtable hashtable=new Hashtable();
hashtable.printHash();
    }
}
