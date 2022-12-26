package tree.binarytree.easy;

import tree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftViewBT {
    static Node root = null;

    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);
        root.left.right = new Node(8);

        ArrayList<Integer> ans = leftView(root);
        for (int i : ans)
            System.out.print(i + " ");
    }

    //Function to return list containing elements of left view of binary tree.
    static ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return null;
        Queue<Node> queue = new LinkedList<>();
        Node temp = null;
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            temp = queue.peek();
            ans.add(temp.data);
            while (size-- > 0) {
                temp = queue.peek();
                queue.poll();
                if (temp.left != null)
                    queue.add(temp.left);
                if (temp.right != null)
                    queue.add(temp.right);
            }
        }
        return ans;
    }
}
