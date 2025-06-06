package LinkedList.Introduction;

public class CustomDLL {

    private Node head;
   

    public void insertFirst(int Value){
        if(head == null){
            head = new Node(Value);
            return;
        }

        Node node = new Node(Value);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
        
    }

    public void insertLast(int Value){
        if(head == null){
            insertFirst(Value);
            return;
        }

        Node node = new Node(Value);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
    }

    public void insertAtIndex(int Value, int index){
        if(index == 0){
            insertFirst(Value);
            return;
        }
        Node temp = head;
        for(int i = 0; i < index - 1; i++){
            if(temp == null) {
                throw new IndexOutOfBoundsException("Index out of bounds: " + index);
            }
            temp = temp.next;
        }
        if(temp == null) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        Node node = new Node(Value);
        node.next = temp.next;
        node.prev = temp;
        if(temp.next != null) {
            temp.next.prev = node;
        }
        temp.next = node;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayReverse(){
        Node temp = head;
        if(temp == null) {
            System.out.println("null");
            return;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        while(temp != null){
            System.out.print(temp.value + " <-> ");
            temp = temp.prev;
        }
        System.out.println("start");
    }

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    } 
}
