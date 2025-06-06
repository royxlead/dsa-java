package LinkedList.Introduction;

public class DLL {
    public static void main(String[] args) {
        CustomDLL list = new CustomDLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);

        System.out.println("Initial doubly linked list:");
        list.display();
        System.out.println();

        System.out.println("Doubly linked list in reverse order:");
        list.displayReverse();
        System.out.println();

        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(6);
        list.insertLast(7);

        System.out.println("Doubly linked list after inserting elements at the end:");
        list.display();
        System.out.println();

        list.insertAtIndex(6, 2);
        list.insertAtIndex(7, 0);
        list.insertAtIndex(9, 8);
        list.insertAtIndex(10, 3);

        System.out.println("Doubly linked list after inserting elements at specific indices:");
        list.display();
        System.out.println();
      
    }
}
