package BST;

import java.util.*;

public class merge2Bst {

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

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(ArrayList<Integer> arr, Node root) {
        if (root == null) {
            return;
        }
        inOrder(arr, root.left);
        arr.add(root.data);
        inOrder(arr, root.right);
    }

    public static Node createBst(ArrayList<Integer> arr, int st, int end) {
        if (st > end) {
            return null;
        }

        int mid = (st + end) / 2;
        Node root = new Node(arr.get(mid));

        root.left = createBst(arr, st, mid - 1);
        root.right = createBst(arr, mid + 1, end);
        return root;
    }

    public static Node mergeBst(Node root1, Node root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        inOrder(arr1, root1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        inOrder(arr2, root2);

        // merge
        int i = 0, j = 0;
        ArrayList<Integer> FinArr = new ArrayList<>();
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                FinArr.add(arr1.get(i));
                i++;
            } else {
                FinArr.add(arr2.get(j));
                j++;
            }
        }
        while (i < arr1.size()) {
            FinArr.add(arr1.get(i));
            i++;
        }
        while (j < arr2.size()) {
            FinArr.add(arr2.get(j));
            j++;
        }

        // sorted array
        return createBst(FinArr, 0, FinArr.size() - 1);
    }

    public static void main(String args[]) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBst(root1, root2);
        preOrder(root);
    }

}
