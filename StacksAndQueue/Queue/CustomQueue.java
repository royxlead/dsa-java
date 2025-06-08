package StacksAndQueue.Queue;

public class CustomQueue {
    protected int[] stack;
    private static final int DEFAULT_CAPACITY = 10;

    int end = 0;

    public CustomQueue() {
        this(DEFAULT_CAPACITY);
    }

    public CustomQueue(int size) {
        this.stack = new int[size];
    }

    public boolean isFull() {
        return end == stack.length;
    }
    public boolean isEmpty() {
        return end == 0;
    }

    public int peek() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot peek.");
        }
        return stack[0];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < end; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public boolean enqueue(int value) throws IllegalStateException {
        if (isFull()) {
            throw new IllegalStateException("Queue is full. Cannot enqueue " + value);
        }
        stack[end++] = value;
        return true;
    }

    public int dequeue() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot dequeue.");
        }
        int value = stack[0];

        for (int i = 1; i < end; i++) {
            stack[i - 1] = stack[i];
        }
        end--;
        return value;
    }
}
