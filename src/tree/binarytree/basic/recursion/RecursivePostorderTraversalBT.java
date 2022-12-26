package tree.binarytree.basic.recursion;

import tree.Node;

public class RecursivePostorderTraversalBT {
    static Node root = null;

    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);
        postOrder(root);

    }

    // Function to return a list containing the inorder traversal of the tree.
    static void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
}
