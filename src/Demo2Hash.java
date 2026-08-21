class HashTable
{
    private int size=7;
    private Node[]dataMap;
    class Node{
        int value;
        String  key;
        Node next;
        Node(int value ,String key)
        {
            this.key=key;
            this.value=value;
        }
    }
    public HashTable()
    {
        dataMap=new Node[size];
    }
    public void printHash()
    {
        for (int i=0;i<dataMap.length;i++)
        {
            System.out.println(i+": ");
            Node temp=dataMap[i];
            while (temp!=null)
            {
                System.out.println("{"+temp.key+"="+temp.value+"}");
                temp=temp.next;
            }
        }
    }
    private int hash(String key)
    {
        int hash=0;
        char []keyChars=key.toCharArray();
        for (int i=0;i<keyChars.length;i++)
        {
           int acsciiValue=keyChars[i];
           hash=(hash+acsciiValue*23)%dataMap.length;
        }
        return hash;
    }
}
public class Demo2Hash
{
    public static void main(String[] args) {
HashTable hashTable=new HashTable();
hashTable.printHash();
    }
}