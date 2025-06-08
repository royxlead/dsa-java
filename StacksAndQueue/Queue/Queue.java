package StacksAndQueue.Queue;

public class Queue {
    public static void main(String[] args) {
        // CustomQueue queue = new CustomQueue(5);
        // CircularQueue queue = new CircularQueue(5);
        DynamicQueue queue = new DynamicQueue(5); 

        System.out.println("Queue created with capacity: " + queue.stack.length);
        queue.enqueue(10);
        queue.enqueue(20);  
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();
        System.out.println("Peek: " + queue.peek());
        queue.dequeue();
        System.out.println("After dequeue:");
        queue.display();
        queue.enqueue(60);
        System.out.println("After enqueue 60:");
        queue.display();

        queue.enqueue(70);
        queue.enqueue(80);
        queue.enqueue(90);
        System.out.println("After enqueue 70, 80, 90:");
        queue.display();
    }
}
