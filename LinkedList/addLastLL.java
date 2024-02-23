package LinkedList;

public class addLastLL {

    public static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
        }else{
        tail.next=newNode;
        tail=newNode;
        }
    }

    public void print()
    {
        if(head==null)
        {
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        addLastLL ll=new addLastLL();

        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);

        ll.print();
    }
    
}
