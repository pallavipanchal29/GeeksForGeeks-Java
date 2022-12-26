package tree.binarytree.basic;

import tree.Node;

import java.util.ArrayList;
import java.util.Stack;

public class IterativePreorderTraversalBT {
    static Node root = null;

    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        var ans = preorder(root);

        for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + " ");
    }

    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return null;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.peek();
            ans.add(node.data);
            stack.pop();

            if (node.right != null)
                stack.push(node.right);
            if (node.left != null)
                stack.push(node.left);
        }
        return ans;
    }
}
