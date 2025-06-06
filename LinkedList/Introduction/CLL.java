package LinkedList.Introduction;

public class CLL {
    public static void main(String[] args) {
        CustomCLL list = new CustomCLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);

        System.out.println("Initial circular linked list:");
        list.display();
        System.out.println();

        list.deleteFirst();
        System.out.println("Circular linked list after deleting the first element:");
        list.display();
        System.out.println();
    }
}
