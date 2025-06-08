package StacksAndQueue.Stack;

public class Stack {
    public static void main(String[] args) {
        // CustomStack stack = new CustomStack(5);
        DynamicStack stack = new DynamicStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(51);
        
        System.out.println("Top element is: " + stack.peek());
        
        // System.out.println("Popping elements:");
        // while (!stack.isEmpty()) {
        //     System.out.println(stack.pop());
        // }
        
        // System.out.println("Popping from empty stack: " + stack.pop());
    }
}
