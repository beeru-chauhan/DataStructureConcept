package hashTable;
class HashTable5
{
   private int size=7;
   private  Node []dataMap;
   class Node
   {
       int value;
       Node next;
       String key;
       Node (String key,int value)
       {
           this.key=key;
           this.value=value;
       }
   }
public HashTable5()
{
    dataMap=new Node[size];
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
    return hash;
}
public void set(String key,int value)
{
   int index=hash(key);
   Node newNode=new Node(key,value);
   Node temp=dataMap[index];
   if (dataMap[index]==null)
   {
       dataMap[index]=newNode;
   }
   else
   {
       while (temp.next!=null)
       {
           temp=temp.next;
       }
       temp.next=newNode;
   }
}
public void printHash() {
    for (int i = 0; i < dataMap.length; i++)
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
public int get(String key)
{

}
}
public class KeyMethod
{
    public static void main(String[] args) {

    }
}
