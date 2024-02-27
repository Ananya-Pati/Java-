package LinkedList;
public class removeCycleLL {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void print() {
        if (head == null) {
            System.out.println("the LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;

    }

    public static void main(String args[]) {
        removeCycleLL ll = new removeCycleLL();
        ll.head = new Node(1);
        Node temp = new Node(2);
        ll.head.next = temp;
        ll.head.next.next = new Node(3);
        ll.head.next.next.next = temp;

        ll.removeCycle();
        ll.print();
    }

}