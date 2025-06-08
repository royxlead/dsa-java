package LinkedList.InterviewQuestions;

public class MergeTwoSortedLists {
    private Node head;
    private Node tail;

     private int size;
    public MergeTwoSortedLists(){
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

    public static MergeTwoSortedLists mergeTwoLists(MergeTwoSortedLists list1, MergeTwoSortedLists list2){
        Node f = list1.head;
        Node s = list2.head;

        MergeTwoSortedLists mergedList = new MergeTwoSortedLists();

        while (f != null && s != null) {
            if(f.value < s.value){
                mergedList.insertLast(f.value);
                f = f.next;
            } else{
                mergedList.insertLast(s.value);
                s = s.next;
            }
        }
        while (f != null) {
            mergedList.insertLast(f.value);
            f = f.next;
        }
        while (s != null) {
            mergedList.insertLast(s.value);
            s = s.next;
        }
        return mergedList;
    }

    public static void main(String[] args) {
        MergeTwoSortedLists list1 = new MergeTwoSortedLists();
        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(4);

        MergeTwoSortedLists list2 = new MergeTwoSortedLists();
        list2.insertLast(1);
        list2.insertLast(3);
        list2.insertLast(4);

        MergeTwoSortedLists mergedList = mergeTwoLists(list1, list2);
        mergedList.display();
    }
}
