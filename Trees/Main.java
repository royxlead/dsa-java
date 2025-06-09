package Trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // BinaryTree tree = new BinaryTree();
        // tree.populateTreeFromInput(scanner);
        // tree.displayTree();
        // scanner.close();

        // BST bst = new BST();
        // System.out.println("Enter numbers to insert into the BST (type 'done' to finish):");
        // while (scanner.hasNext()) {
        //     if (scanner.hasNextInt()) {
        //         int value = scanner.nextInt();
        //         bst.insert(value);
        //     } else {
        //         String input = scanner.next();
        //         if (input.equalsIgnoreCase("done")) {
        //             break;
        //         } else {
        //             System.out.println("Invalid input. Please enter a number or 'done'.");
        //         }
        //     }
        // }
        // System.out.println("BST created:");
        // bst.display();
        // scanner.close();
        
        Traversals.Node root = new Traversals.Node(1);
        root.left = new Traversals.Node(2);
        root.right = new Traversals.Node(3);

        System.out.println("In-order Traversal:");
        Traversals.inOrder(root);
        System.out.println("\nPre-order Traversal:");
        Traversals.preOrder(root);
        System.out.println("\nPost-order Traversal:");
        Traversals.postOrder(root);
    }
}
