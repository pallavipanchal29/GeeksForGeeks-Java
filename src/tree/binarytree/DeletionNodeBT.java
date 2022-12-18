package tree.binarytree;

import tree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class DeletionNodeBT {
    static Node root;

    static void delete(Node root, int key) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            if (root.data == key) {
                root = null;
            }
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        Node keyNode = null;
        Node temp = null;

        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();
            if (temp.data == key)
                keyNode = temp;
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
        }
        if (keyNode != null) {
            int x = temp.data; // get data of rightmost deep node
            DeleteDeepest(root, temp); // delete the deepest node
            keyNode.data = x; // assign value of deepest node to keynode
        }

    }

    private static void DeleteDeepest(Node root, Node deleNode) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node temp = null;
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();
            if (temp.data == deleNode.data) {
                temp = null;
                return;
            }
            if (temp.right != null) {
                if (temp.right == deleNode) {
                    temp.right = null;
                    return;
                } else
                    q.add(temp.right);
            }
            if (temp.left != null) {
                if (temp.left == deleNode) {
                    temp.left = null;
                    return;
                } else
                    q.add(temp.left);
            }
        }
    }
}
