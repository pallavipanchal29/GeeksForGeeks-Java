package stack.basic;

public class ImplementStackUsingArray {
    int top;
    int[] arr = new int[1000];

    ImplementStackUsingArray() {
        top = -1;
    }

    //Function to push an integer into the stack.
    void push(int a) {
        if (top == arr.length - 1) return;
        else arr[++top] = a;
    }

    //Function to remove an item from top of the stack.
    int pop() {
        if (top == -1) return -1;
        else return arr[top--];
    }
}
