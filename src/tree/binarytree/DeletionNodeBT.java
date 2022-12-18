package tree.binarytree;

import tree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class DeletionNodeBT {
    static Node root;

    static Node deletion(Node root, int key) {
        if (root == null)
            return null;

        if (root.left == null && root.right == null) {
            return root.data == key ? root : null;
        }

        Node keyNode = null, temp = null, last = null;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        // Do level order traversal to find deepest
        // node(temp), node to be deleted (key_node)
        // and parent of deepest node(last)
        while (!q.isEmpty()) {
            temp = q.poll();

            if (temp.data == key)
                keyNode = temp;

            if (temp.left != null) {
                last = temp; // storing the parent node
                q.offer(temp.left);
            }

            if (temp.right != null) {
                last = temp; // storing the parent node
                q.offer(temp.right);
            }
        }

        if (keyNode != null) {
            keyNode.data = temp.data; // replacing key_node's data to deepest node's data

            if (last.right == temp) {
                last.right = null;
            } else {
                last.left = null;
            }
        }

        return root;
    }
}
