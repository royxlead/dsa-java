package LinkedList.InterviewQuestions;

class RemoveDuplicatesFromSortedList {
    private Node head;
    private Node tail;

     private int size;
    public RemoveDuplicatesFromSortedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void display() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

   public void insertLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void removeDuplicates(){
        Node node = head;

        while (node.next != null) {
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }
            else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList list = new RemoveDuplicatesFromSortedList();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(4);
        list.insertLast(4);
        list.display();

        System.out.println("Removing duplicates...");
        list.removeDuplicates();
        list.display();
    }
}
