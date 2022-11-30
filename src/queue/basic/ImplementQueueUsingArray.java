package queue.basic;

import java.util.Scanner;

public class ImplementQueueUsingArray {
    int front, rear;
    int[] arr = new int[100005];

    ImplementQueueUsingArray() {
        front = -1;
        rear = -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            ImplementQueueUsingArray obj = new ImplementQueueUsingArray();
            int Q = sc.nextInt();
            while (Q > 0) {
                int type = 0;
                type = sc.nextInt();
                if (type == 1) {
                    int a = sc.nextInt();
                    obj.push(a);
                } else if (type == 2)
                    System.out.println(obj.pop() + " ");
                Q--;
            }
            System.out.println();
            t--;
        }
    }

    //Function to push an element x in a queue.
    void push(int x) {
        if (rear == arr.length - 1) return;
        if (front == -1) front++;
        arr[++rear] = x;
    }

    //Function to pop an element from queue and return that element.
    int pop() {
        if (front == -1 || front > rear) return -1;
        return arr[front++];
    }
}
