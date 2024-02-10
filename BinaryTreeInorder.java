import org.w3c.dom.Node;

public class BinaryTreeInorder {
    static class Node{
     int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right= null;
        }
    }
    static class BinaryTree{
    public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        int nodes []= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root =tree.buildTree(nodes);
        tree.inorder(root);
    }

}
