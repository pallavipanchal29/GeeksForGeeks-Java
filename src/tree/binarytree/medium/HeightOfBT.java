package tree.binarytree.medium;

import tree.Node;

public class HeightOfBT {
    static Node root = null;

    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);

        System.out.println(height(root));
    }

    //Function to find the height of a binary tree.
    static int height(Node node) {
        if (node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));

//        if(node == null)
//             return 0;
//        else
//        {
//            int left = height(root.left);
//            int right = height(root.right);
//            return Math.max(left,right);
//        }
    }
}
