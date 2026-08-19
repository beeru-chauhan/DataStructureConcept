package tree.DSA;
class Bst
{
    Node root;
    class Node
    {
        int value;
        Node left;
        Node right;
        Node(int value)
        {
            this.value=value;
        }
    }
    public boolean insert( int value)
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
                temp.right=newNode;

            }
            temp=temp.right;
        }

    }
}
public class Demo
{
    public static void main(String[] args) {
        Bst bSearchTree=new Bst();
        bSearchTree.insert(47);
        bSearchTree.insert(21);
        bSearchTree.insert(76);
        bSearchTree.insert(18);
        bSearchTree.insert(52);
        bSearchTree.insert(82);
        bSearchTree.insert(27);
        System.out.println(bSearchTree.root.left.right.value);
    }
}
