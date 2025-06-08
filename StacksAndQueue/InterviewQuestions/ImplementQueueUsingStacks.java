package StacksAndQueue.InterviewQuestions;

import java.util.Stack;

public class ImplementQueueUsingStacks {

    static class MyQueue {
        private Stack<Integer> stack1;
        private Stack<Integer> stack2;

        public MyQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void push(int x) {
            stack1.push(x); 
        }

        public int pop() {
            shiftStacksIfNeeded();
            return stack2.pop();
        }

        public int peek() {
            shiftStacksIfNeeded();
            return stack2.peek();
        }

        public boolean isEmpty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }

        private void shiftStacksIfNeeded() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);  
        System.out.println(queue.peek()); 
        System.out.println(queue.pop());  
        System.out.println(queue.isEmpty()); 
    }
}
