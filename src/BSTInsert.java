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
          return  true;
      }
      Node  temp=root;
      while (true)
      {
          if (newNode.value==temp.value)
          {
              return false;
          }
          if (temp.value> newNode.value)
          {
              if (temp.left==null)
              {
                  temp.left=newNode;
                  return true;
              }
              temp=temp.left;
          }
          else
          {
              if (temp.right==null)
              {
                  temp.right=newNode;
                  return true;
              }
              temp=temp.right;
          }
      }
    }
}
public class BSTInsert
{
    public static void main(String[] args) {
BSearchTree bSearchTree=new BSearchTree();
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
