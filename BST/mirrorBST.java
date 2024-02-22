package BST;
import java.util.*;

public class mirrorBST {

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

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        inOrder(root.left);
        inOrder(root.right);
    }

    public static Node isMirror(Node root) {
        if (root == null) {
            return null;
        }
        Node left = isMirror(root.left);
        Node right = isMirror(root.right);

        root.left = right;
        root.right = left;
        return root;
    }

    public static void main(String args[]) {
        int arr[] = { 8, 5, 3, 6, 10, 11 };
        Node root = null;

        for (int i = 0; i < arr.length; i++) {
            root = buildBst(root, arr[i]);
        }

        inOrder(root);
        System.out.println();

        isMirror(root);
        preOrder(root);
    }

}
