package tree.binarytree;

import tree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class InsertNodeBT {
    static Node root;

    static void insert(Node temp, int key) {
        if (temp == null) {
            root = new Node(key);
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(temp);

        while (q.size() > 0) {
            temp = q.peek();
            q.poll();
            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else
                q.add(temp.left);
            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else
                q.add(temp.right);
        }
    }
}
