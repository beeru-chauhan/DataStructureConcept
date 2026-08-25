package hashTable;
class HashTable4
{
    private int size=7;
    private  Node[]dataMap;
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
    public HashTable4()
    {
        dataMap =new Node[size];
    }
   private int hash(String key)
    {
        int hash=0;
        char []keyChars=key.toCharArray();
        for (int i=0;i<keyChars.length;i++)
        {
            int asciiValue=keyChars[i];
            hash=(hash+asciiValue*23)%keyChars.length;
        }
        return  hash;
    }
    public void printHashTable()
    {
        for (int i=0;i<dataMap.length;i++)
        {
            System.out.println(i+":");
            Node temp=dataMap[i];
            while (temp!=null)
            {
                System.out.println("{"+temp.key+"="+temp.value+"}");
                temp=temp.next;
            }
        }
    }
   public void set (String key,int value)
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
       public  int get(String key) {
           int index = hash(key);
           Node temp = dataMap[index];
           while (temp != null)
           {
               if (temp.key==key)
               {
                   return temp.value;
               }
           }
           return 0;
           }
}
public class GetMethod
{
    public static void main(String[] args) {
HashTable4 hashTable4=new HashTable4();
hashTable4.set("tile",10);
hashTable4.set("lumber",20);
hashTable4.set("screws",30);
//hashTable4.printHashTable();
        System.out.println(hashTable4.get("lumber"));
        System.out.println(hashTable4.get("tile"));
        System.out.println(hashTable4.get("bolts"));
    }
}
