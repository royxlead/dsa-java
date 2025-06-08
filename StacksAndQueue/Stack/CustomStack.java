package StacksAndQueue.Stack;

public class CustomStack {
    protected int[] stack;
    private static final int DEFAULT_CAPACITY = 10;

    int top = -1;

    public CustomStack() {
        this(DEFAULT_CAPACITY);
    }

    public CustomStack(int size) {
        this.stack = new int[size];
    }

    public boolean push(int value) throws IllegalStateException {
        if (isFull()) {
            throw new IllegalStateException("Stack is full. Cannot push " + value);
        }
        stack[++top] = value;
        return true;
    }

    public int pop() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }
        return stack[top--];
    }

    public int peek() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek.");
        }
        return stack[top];
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
