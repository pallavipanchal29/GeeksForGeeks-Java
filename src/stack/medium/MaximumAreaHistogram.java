package stack.medium;

import java.util.Stack;

public class MaximumAreaHistogram {
    public static void main(String[] args) {
        System.out.println(getMaxArea(new long[]{6, 2, 5, 4, 5, 1, 6}, 7));
    }

    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long[] heights, long n) {
        int len = (int) n;
        int[] left = new int[len];
        int[] right = new int[len];
        Stack<Integer> stack = new Stack<>();
        //traversing left to right and finding the left limit of each number with the help of stack
        for (int i = 0; i < len; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
                left[i] = 0;
            } else {
                //remove the index from stack if their height is greater or equal to curr number's height
                while (!stack.isEmpty() && heights[stack.peek()] >= heights[i])
                    stack.pop();
                //when we found the index with less height that becomes left limit of curr number (index+1)
                left[i] = stack.isEmpty() ? 0 : stack.peek() + 1;
                stack.push(i);
            }
        }
        //removed old stored values
        stack = new Stack<>();

        //traversing from right to left and finding the right limit of each number with the help of stack
        for (int i = len - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                stack.push(i);
                right[i] = len - 1;
            } else {
                //remove the index from stack if their height is greater or equal to curr number's height
                while (!stack.isEmpty() && heights[stack.peek()] >= heights[i])
                    stack.pop();
                //when we found the index with less height that becomes right limit of curr number (index-1)
                right[i] = stack.isEmpty() ? len - 1 : stack.peek() - 1;
                stack.push(i);
            }
        }
        //calculating the area and finding max area
        int maxArea = Integer.MIN_VALUE;
        int[] area = new int[len];
        for (int i = 0; i < len; i++) {
            area[i] = (int) ((right[i] - left[i] + 1) * heights[i]);
            maxArea = Math.max(maxArea, area[i]);
        }
        return maxArea;
    }
}
