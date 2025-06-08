package StacksAndQueue.InterviewQuestions;

import java.util.Stack;

public class LargestRectangleInHistogram {
    static int largestRectangleArea(int[] heights){
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        stack.push(0);
        for(int i = 1; i < heights.length; i++){
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                maxArea = getMaxArea(heights, stack, maxArea, i);
            }
            stack.push(i);
        }
        int i = heights.length;
        while (!stack.isEmpty()) {
            maxArea = getMaxArea(heights, stack, maxArea, i);
        }
        return maxArea;
    }

    private static int getMaxArea(int[] heights, Stack<Integer> stack, int maxArea, int i) {
        int area;
        int poppedIndex = stack.pop();
        if (stack.isEmpty()) {
            area = heights[poppedIndex] * i;
        } else {
            area = heights[poppedIndex] * (i - stack.peek() - 1);
        }
        return Math.max(maxArea, area);
    }
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(heights)); 
    }
}
