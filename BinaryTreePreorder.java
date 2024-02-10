import java.util.*;

public class BinaryTreePreorder {
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
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static void postorder(Node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data+" ");

        }
        public static int diameter(Node root){
            if(root == null){
                return 0;
            }
            int leftDiam = diameter(root.left);
            int leftHt = height(root.left);
            int rightDiam  = diameter(root.right);
            int rightHt = height(root.right);
            int selfDiam = leftHt +rightHt +1;
            return Math.max(selfDiam,Math.max(leftDiam,rightDiam));
        }
    }
    public static void main(String[] args) {
        int nodes []= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root =tree.buildTree(nodes);
        tree.postorder(root);
        System.out.println(diameter(root));
    }
}
