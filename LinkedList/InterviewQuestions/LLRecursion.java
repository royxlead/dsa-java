package LinkedList.InterviewQuestions;

class LLRecursion {
    private Node head;
    private Node tail;

     private int size;
    public LLRecursion(){
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

    public void insertUsingRecursion(int value, int index){
        head = insertRecursesively(value, index, head);
    }
    private Node insertRecursesively(int value, int index, Node node){
        if(index == 0){
            Node temp = new Node(value, node);
            size++;
            return temp;
        }

        node.next = insertRecursesively(value, index - 1, node.next);
        return node;
    }

    public static void main(String[] args) {
        LLRecursion list = new LLRecursion();
        list.insertUsingRecursion(10, 0);
        list.insertUsingRecursion(20, 1);
        list.insertUsingRecursion(30, 2);
        list.insertUsingRecursion(40, 3);
        list.insertUsingRecursion(50, 4);
        list.display(); 
        list.insertUsingRecursion(25, 2);   
        list.display(); 
        list.insertUsingRecursion(5, 0);
        list.display(); 
    }
}
