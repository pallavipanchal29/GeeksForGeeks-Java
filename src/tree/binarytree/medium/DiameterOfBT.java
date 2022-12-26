package tree.binarytree.medium;

import tree.Node;

public class DiameterOfBT {
    public static void main(String[] args) {

    }

    // Function to return the diameter of a Binary Tree.
    static int diameter(Node root) {
        if (root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);

        int ld = diameter(root.left);
        int rd = diameter(root.right);

        return Math.max(rh + lh + 1, Math.max(rd, ld));
    }

    static int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
