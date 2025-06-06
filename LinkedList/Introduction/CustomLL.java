package LinkedList.Introduction;

public class CustomLL {

    private Node head;
    private Node tail;

    private int size;
    public CustomLL(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size++;
    }
    
    public void display(){
        Node temp = head;
        while(temp != null){
             System.out.print(temp.value + " -> ");;
             temp = temp.next;
        }
        System.out.println("null");
    }

    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtIndex(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        Node temp = head;
        for(int i = 0; i < index - 1; i++){
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public void deleteFirst(){
        if(head == null){
            throw new IllegalStateException("The linked list is empty.");
        }
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
    }

    public void deleteLast(){
        if(tail == null){
            throw new IllegalStateException("The linked list is empty.");
        }
        if(head == tail){
            head = tail = null;
            size = 0;
        }else{
            Node temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size--;
        }
    }

    public void deleteAtIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        if(index == 0){
            deleteFirst();
            return;
        }
        if(index == size - 1){
            deleteLast();
            return;
        }
        Node temp = head;
        for(int i = 0; i < index - 1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    public int getSize() {
        return size;
    }

    public int getHead() {
        if (head == null) {
            throw new IllegalStateException("The linked list is empty.");
        }
        return head.value;
    }

    public int getTail() {
        if (tail == null) {
            throw new IllegalStateException("The linked list is empty.");
        }
        return tail.value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int find(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == value) {
                return temp.value;
            }
            temp = temp.next;
        }
        return -1; 
    }

    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
