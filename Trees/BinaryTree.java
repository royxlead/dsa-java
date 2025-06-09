package Trees;

import java.util.Scanner;

public class BinaryTree {

    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    public void populateTreeFromInput(Scanner scanner) {
        System.out.print("Enter the root value: ");
        int data = scanner.nextInt();
        root = new Node(data);
        populateRecursive(scanner, root);
    }

    private void populateRecursive(Scanner scanner, Node node) {
        System.out.print("Do you want to add a left child to " + node.data + "? (true/false): ");
        boolean addLeft = scanner.nextBoolean();
        if (addLeft) {
            System.out.print("Enter the left child value: ");
            int leftData = scanner.nextInt();
            node.left = new Node(leftData);
            populateRecursive(scanner, node.left);
        }

        System.out.print("Do you want to add a right child to " + node.data + "? (true/false): ");
        boolean addRight = scanner.nextBoolean();
        if (addRight) {
            System.out.print("Enter the right child value: ");
            int rightData = scanner.nextInt();
            node.right = new Node(rightData);
            populateRecursive(scanner, node.right);
        }
    }

    public void displayTree() {
        displayTree(root, 0);
    }

    private void displayTree(Node node, int level) {
        if (node == null) {
            return;
        }

        displayTree(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++)
                System.out.print("|\t\t");
            System.out.println("|------> " + node.data);
        } else {
            System.out.println(node.data);
        }

        displayTree(node.left, level + 1);
    }
}
