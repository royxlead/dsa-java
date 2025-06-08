package StacksAndQueue.Queue;

public class CircularQueue {
    protected int[] stack;
    private static final int DEFAULT_CAPACITY = 10;

    protected int end = 0;
    protected int front = 0;
    protected int size = 0;

    public CircularQueue() {
        this(DEFAULT_CAPACITY);
    }

    public CircularQueue(int size) {
        this.stack = new int[size];
    }

    public boolean isFull() {
        return size == stack.length;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public int peek() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot peek.");
        }
        return stack[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(stack[(front + i) % stack.length] + " ");
        }
        System.out.println();
    }

    public boolean enqueue(int value) throws IllegalStateException {
        if (isFull()) {
            throw new IllegalStateException("Queue is full. Cannot enqueue " + value);
        }
        stack[end] = value;
        end = (end + 1) % stack.length;
        size++;
        return true;
    }

    public int dequeue() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot dequeue.");
        }
        int value = stack[front];
        front = (front + 1) % stack.length;
        size--;
        return value;
    }
}
