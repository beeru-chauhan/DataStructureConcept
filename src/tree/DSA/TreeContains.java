package tree.DSA;
class BSearchTree
{
    Node root;
    class Node
    {
        Node left;
       Node right;
       int value;
       Node(int value)
       {
           this.value=value;
       }
    }
    public boolean insert(int value)
    {
        Node newNode=new Node(value);
        if (root==null)
        {
            root=newNode;
            return true;
        }
        Node temp=root;
        while (true)
        {
            if (newNode==temp)
            {
                return false;
            }
            if (newNode.value<temp.value)
            {
                if (temp.left==null)
                {
                    temp.left=newNode;
                }
                temp=temp.left;
            }
            else
            {
                if (temp.right==null)
                {
                    temp.right=newNode;
                }
                temp=temp.right;
            }
        }
    }
    public boolean contains(int value)
    {
        
        Node temp=root;
        while (temp!=null)
        {
            if (value < temp.value)
            {
                temp=temp.left;
            }
            else if (value > temp.value)
            {
            temp=temp.right;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}

public class TreeContains
{
    public static void main(String[] args) {
BSearchTree bSearchTree=new BSearchTree();
bSearchTree.insert(47);
bSearchTree.insert(21);
bSearchTree.insert(76);
bSearchTree.insert(78);
bSearchTree.insert(52);
bSearchTree.insert(82);
bSearchTree.insert(27);
        System.out.println(bSearchTree.contains(27));
        System.out.println(bSearchTree.contains(10));
    }
}
