package tree.binarytree.easy;

import tree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalBT {
    static Node root = null;

    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        var ans = levelOrder(root);

        for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + " ");
    }

    //Function to return the level order traversal of a tree.
    static ArrayList<Integer> levelOrder(Node node) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (node == null) return null;
        Node temp = node;
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            temp = queue.peek();
            queue.poll();
            ans.add(temp.data);
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
        }
        return ans;
    }
}
