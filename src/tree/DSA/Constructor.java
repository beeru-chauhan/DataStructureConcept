package tree.DSA;
class BinarySearchTree
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
}
public class Constructor
{
    public static void main(String[]args){
BinarySearchTree myTree=new BinarySearchTree();
        System.out.println("root: "+myTree.root);
    }
}
