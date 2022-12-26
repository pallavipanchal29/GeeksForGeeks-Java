package tree.binarytree.easy;

import tree.Node;

public class MirrorTree {
    public static void main(String[] args) {

    }

    static void mirror(Node node) {
        if (node == null)
            return;
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
        mirror(node.left);
        mirror(node.right);
    }

}
