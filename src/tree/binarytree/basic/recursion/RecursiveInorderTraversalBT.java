package tree.binarytree.basic.recursion;

import tree.Node;

public class RecursiveInorderTraversalBT {
    static Node root = null;

    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);
        inOrder(root);

    }

    // Function to return a list containing the inorder traversal of the tree.
    static void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
}
