package LinkedList;

public class addFirstLL {

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){

        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
        }else{
        newNode.next=head;
        head=newNode;
        }
    }

    public void print()
    {
        if(head==null)
        {
            System.out.println("the LL is empty");
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

    public static void main(String args[])
    {
        addFirstLL ll=new addFirstLL();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

        ll.print();
    }
    
}
