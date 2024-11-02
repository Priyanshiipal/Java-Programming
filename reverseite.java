class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next=null;
    }
}

class LinkedList{
    Node head=null;

    void insertAtBeg(int data){
        Node n=new Node(data);
        if (head==null) {
            head=n;
            return;
        }   
        n.next=head;
        head=n;
    }

    void insertAtEnd(int data){
        Node n=new Node(data);

        if(head == null){
            head=n;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
    }

    void insert(int num, int data){
        Node temp=head;
        while(temp!=null && temp.data<num){
            temp=temp.next;

        }
        Node n=new Node(data);
        n.next=temp;
        temp.next=n;

    }

    void reverseiterate(){
        if(head==null || head.next==null){
            return;
        }

        Node prev=head;
        Node current=head.next;

        while(current != null) { 
            Node nextNode=current.next;
            current.next=prev;

            //updating
            prev=current;
            current=nextNode;
        }
    head.next=null;
    head=prev;
    }

    public Node reverserecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node newHead=reverserecursive(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;
    }

    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
}
    public class reverseite{
        public static void main(String[] args){
            LinkedList list=new LinkedList();

            list.insertAtBeg(1);
            list.insertAtEnd(2);
            list.insertAtEnd(3);
            list.insertAtEnd(4);
            list.insertAtEnd(5);
            list.print();
           list.head= list.reverserecursive(list.head);
            list.print();
            list.reverseiterate();
            list.print();
            
            
        }
    }
    

