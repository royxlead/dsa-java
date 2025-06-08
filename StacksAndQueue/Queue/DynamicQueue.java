package StacksAndQueue.Queue;

public class DynamicQueue extends CircularQueue {
    private static final int DEFAULT_CAPACITY = 10;

    public DynamicQueue() {
        this(DEFAULT_CAPACITY);
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean enqueue(int value) throws IllegalStateException {
        if (isFull()) {
            resize();
        }
        return super.enqueue(value);
    }

    private void resize() {
        int newSize = stack.length * 2;
        int[] newStack = new int[newSize];
        
        for (int i = 0; i < size; i++) {
            newStack[i] = stack[(front + i) % stack.length];
        }
        
        stack = newStack;
        front = 0;
        end = size;
    }
    
}
