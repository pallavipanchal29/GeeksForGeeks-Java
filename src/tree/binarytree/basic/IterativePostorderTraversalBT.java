package tree.binarytree.basic;

import tree.Node;

import java.util.ArrayList;
import java.util.Stack;

public class IterativePostorderTraversalBT {
    //1. initial config : Take the root and put it in the 1st stack.
    //2. Now, take the top from the 1st stack and put it into the 2nd stack
    //3. After that, if the top in 2nd stack has left → add it in 1st stack.  And if the top in 2nd stack has right → add it in the 1st stack.
    //4. Now again, take the top from the 1st stack and put it into the 2nd stack. Repeat step 2 & 3 untill 1st stack is empty.
    //5. Pop the element from the 2nd stack and print.
    static Node root = null;

    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        var ans = postOrder(root);

        for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + " ");
    }

    //Function to return a list containing the postorder traversal of the tree.
    static ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return null;
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        // push root to first stack
        s1.push(root);

        // Run while first stack is not empty
        while (!s1.isEmpty()) {
            // Pop an item from s1 and push it to s2
            Node temp = s1.pop();
            s2.push(temp);

            // Push left and right children of
            // removed item to s1
            if (temp.left != null)
                s1.push(temp.left);
            if (temp.right != null)
                s1.push(temp.right);
        }

        // Print all elements of second stack
        while (!s2.isEmpty()) {
            Node temp = s2.pop();
            ans.add(temp.data);
        }
        return ans;
    }

}
