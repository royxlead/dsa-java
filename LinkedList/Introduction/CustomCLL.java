package LinkedList.Introduction;

public class CustomCLL {

    private Node head;
    private Node tail;

    public CustomCLL(){
        this.head = null;
        this.tail = null;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            node.next = head; 
        } else {
            node.next = head;
            head = node;
            tail.next = head; 
        }
    }

    public void display(){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        } while(temp != head);
        System.out.println("(head)");
    }

    public void deleteFirst(){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        if(head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            tail.next = head; 
        }
    }

    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
