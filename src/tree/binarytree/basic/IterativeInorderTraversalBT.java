package tree.binarytree.basic;

import tree.Node;

import java.util.ArrayList;
import java.util.Stack;

public class IterativeInorderTraversalBT {
    static Node root = null;

    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        var ans = inOrder(root);

        for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + " ");
    }

    // Function to return a list containing the inorder traversal of the tree.
    static ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return null;
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        while (curr != null || stack.size() > 0) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            ans.add(curr.data);
            curr = curr.right;
        }
        return ans;
    }
}
