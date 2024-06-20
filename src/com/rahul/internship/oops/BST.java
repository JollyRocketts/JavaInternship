package com.rahul.internship.oops;

class Node {
    private int key;
    private Node parent;
    private Node leftChild;
    private Node rightChild;
    public Node(int key, Node leftChild, Node rightChild)
    {
        this.setKey(key);
        this.setLeftChild(leftChild);
        this.setRightChild(rightChild);
    }
    public void setKey(int key) {
        this.key = key;
    }
    public int getKey() {
        return key;
    }
    public void setParent(Node parent) {
        this.parent = parent;
    }
    public Node getParent() {
        return parent;
    }
    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }
    public Node getLeftChild() {
        return leftChild;     }

    public void setRightChild(Node rightChild)
    {
        this.rightChild = rightChild;
    }
    public Node getRightChild() {
        return rightChild;
    }
}
class BinarySearchTree {
    private Node root;
    public void insert(int key) {
        insert(new Node(key, null, null));
    }
    public void insert(Node z) {
        Node y = null;
        Node x = root;
        while (x != null) {
            y = x;
            if (z.getKey() < x.getKey())
            {
                x = x.getLeftChild();
            }
            else {
                x = x.getRightChild();
            }
        }
        z.setParent(y);
        if (y == null){
            root = z;
        }
        else if (z.getKey() < y.getKey()) {
            y.setLeftChild(z);
        }
        else {
            y.setRightChild(z);
        }
    }
    public void preorderTraversal() {
        preorderTraversal(root);     }
    public void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.getKey() + " ");
            preorderTraversal(node.getLeftChild());
            preorderTraversal(node.getRightChild());
        }
    }
    public void inorderTraversal() {
        inorderTraversal(root);     }
    private void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.getLeftChild());
            System.out.print(node.getKey() + " ");
            inorderTraversal(node.getRightChild());
        }
    }
    public void postorderTraversal() {
        postorderTraversal(root);
    }
    private void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.getLeftChild());
            postorderTraversal(node.getRightChild());
            System.out.print(node.getKey() + " ");
        }
    }
}
class BST {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] input = new int[] { 8, 3, 10, 1, 6, 14, 4, 7, 13 };
        for (int i : input) {
            bst.insert(i);
        }
        System.out.println("Preorder Traversal:");
        bst.preorderTraversal();
        System.out.println( "\nInorder Traversal:");
        bst.inorderTraversal();
        System.out.println("\nPostorder Traversal:");
        bst.postorderTraversal();
    }
}

