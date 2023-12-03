package Tree;

public class Binary_Tree {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinartTree {
        static int indx = -1;
        public static Node buildTree(int node[]) {
            indx++;
            if (node[indx] == -1) {
                return null;
            }

            Node newNode = new Node(node[indx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);

            return newNode;

        }

    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
           
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+ " ");
    }
    public static void main(String[] args) {
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1 };
        BinartTree tree = new BinartTree();
        Node root = tree.buildTree(node);
        // System.out.println(root.data);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        
    }
   
    
}