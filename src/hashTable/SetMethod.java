package hashTable;
class Hashtable
{
    private int size=7;
    private Node[] dataMap;
    class Node
    {
        int value;
        Node next;
        String key;
        Node(int value,String key)
        {
            this.key=key;
            this.value=value;
        }
    }
    public Hashtable()
    {
        dataMap=new Node[size];
    }
    private int hash(String key)
    {
        int hash=0;
        char[] keyChars=key.toCharArray();
        for (int i=0;i<keyChars.length;i++)
        {
            int asciiValue=keyChars[i];
            hash=(hash+asciiValue*23)%keyChars.length;
        }
return hash;
    }
    public  void set(String key,int value)
    {
        int index=hash(key);
        Node newNode=new Node(value,key);
        if (dataMap[index]==null)
        {
            dataMap[index]=newNode;
        }
        else
        {
            Node temp=dataMap[index];
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
public void printHash() {
    for (int i = 0; i < dataMap.length; i++) {
        System.out.println(i + ":");
        Node temp = dataMap[i];
        while (temp != null) {
            System.out.println("{" + temp.key + "=" + temp.value + "}");
            temp = temp.next;
        }
    }
    }

}
public class SetMethod
{
    public static void main(String[] args) {
Hashtable hashtable=new Hashtable();
hashtable.set("nails",100);
hashtable.set("tiles",50);
hashtable.set("lumber",150);
hashtable.set("bolts",200);
hashtable.set("screw",500);
hashtable.printHash();
    }
}