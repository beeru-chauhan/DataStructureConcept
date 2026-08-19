package hashTable;
class HashTable2
{
    private int size=7;
    private Node []hashData;
    class Node
    {

        String key;
        Node next;
        int value;
        Node(int value)
        {
            this.key= next.key;
            this.value=value;
        }
    }
    public HashTable2()
    {
        hashData=new Node[size];
    }
    public void printHash()
    {
        for (int i=0;i<hashData.length;i++)
        {
            System.out.println(i+":");
            Node temp=hashData[i];
            while (temp!=null)
            {
                System.out.println("{"+temp.key+"="+temp.value+"}");
                temp=temp.next;
            }
        }
    }
    private int hash(String key)
    {
        int  hash=0;
        char []keyChar=key.toCharArray();
        for (int i=0;i<keyChar.length;i++)
        {
            int asciiCHar=keyChar[i];
        }
        return hash;
    }
}
public class HashMethod1
{
    public static void main(String[] args) {
        HashTable2 hashTable2=new HashTable2();
        hashTable2.printHash();
    }
}
