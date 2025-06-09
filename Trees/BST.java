package Trees;

import Trees.BinaryTree.Node;

public class BST {
    public class Node{
        private int data;
        private Node left;
        private Node right;
        private int height;
        public Node(int data){
            this.data = data;
        }
        public int getData(){
            return data;
        }
    }
    private Node root;
    public BST() {
    }
    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty() {
        return root == null;
    }

    public void display() {
        display(root, "");
    }
    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.getData());

        display(node.left, "Left child of " + node.getData() + ": ");
        display(node.right, "Right child of " + node.getData() + ": ");
    }
    public void insert(int data) {
        root = insert(root, data);
    }
    private Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        if (data < node.getData()) {
            node.left = insert(node.left, data);
        } else if (data > node.getData()) {
            node.right = insert(node.right, data);
        }
        return node;
    }
    public boolean search(int data) {
        return search(root, data);
    }
    private boolean search(Node node, int data) {
        if (node == null) {
            return false;
        }
        if (data < node.getData()) {
            return search(node.left, data);
        } else if (data > node.getData()) {
            return search(node.right, data);
        } else {
            return true; // Found the data
        }
    }
    public void delete(int data) {
        root = delete(root, data);
    }
    private Node delete(Node node, int data) {
        if (node == null) {
            return null; // Data not found
        }
        if (data < node.getData()) {
            node.left = delete(node.left, data);
        } else if (data > node.getData()) {
            node.right = delete(node.right, data);
        } else {
            // Node with only one child or no child
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }
            // Node with two children: Get the inorder successor (smallest in the right subtree)
            Node temp = minValueNode(node.right);
            node.data = temp.data; // Copy the inorder successor's content to this node
            node.right = delete(node.right, temp.data); // Delete the inorder successor
        }
        return node;
    }
    private Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }
}
