package tree.binarytree.basic.recursion;

import tree.Node;

public class RecursivePreorderTraversalBT {
    static Node root = null;

    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);
        preorder(root);

    }

    // Function to return a list containing the inorder traversal of the tree.
    static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

}
