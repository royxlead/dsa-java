package LinkedList.Introduction;


public class LL {
    public static void main(String[] args) {
        CustomLL list = new CustomLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);

        System.out.println("Initial linked list:");
        list.display();
        System.out.println();

        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(7);
        list.insertLast(8);

        System.out.println("Linked list after inserting elements at the end:");
        list.display();
        System.out.println();

        list.insertAtIndex(6, 2); 
        list.insertAtIndex(7, 0);
        list.insertAtIndex(9, 8); 
        list.insertAtIndex(10, 3);

        System.out.println("Linked list after inserting elements at specific indices:");
        list.display();
        System.out.println();
        
        list.deleteFirst();

        System.out.println("Linked list after deleting the first element:");
        list.display();
        System.out.println();

        list.deleteLast();

        System.out.println("Linked list after deleting the last element:");
        list.display();
        System.out.println();

        list.deleteAtIndex(2);

        System.out.println("Linked list after deleting the element at index 2:");
        list.display();
        System.out.println();

        System.out.println("\nSize of the linked list: " + list.getSize());
        System.out.println("\nHead of the linked list: " + list.getHead());
        System.out.println("\nTail of the linked list: " + list.getTail());
        System.out.println("\nSize of the linked list: " + list.getSize());
        System.out.println("\nSearch result for value 10: " + list.find(10));

        if(list.isEmpty()) {
            System.out.println("\nThe linked list is empty.");
        } else {
            System.out.println("\nThe linked list is not empty.");
        }
    }
}
