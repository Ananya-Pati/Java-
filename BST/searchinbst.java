package BST;

import java.util.*;

public class searchInBst {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node buildBst(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = buildBst(root.left, val);
        } else {
            root.right = buildBst(root.right, val);
        }
        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < arr.length; i++) {
            root = buildBst(root, arr[i]);
        }

        // inOrder(root);
        if (search(root, 90)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }

}
