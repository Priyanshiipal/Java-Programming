class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedList{
    Node head=null;

    void insertAtBeg(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            return;
        }
        n.next=head;
        head=n;
    }

    void insertAtEnd(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            return ;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        
        temp.next=n;
    }

    void insert(int num, int data){
       
        Node temp=head;
        while(temp!=null && temp.data!=num){
            temp=temp.next;
        }
         Node n=new Node(data);
       
        n.next=temp.next;
        temp.next=n;

    }

    void reverse(){
        Node prev = null;
        Node current=head;
        Node next=null;

        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }        
        head=prev;
    }

    void print(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data + " ");
            current=current.next;
        }
        System.out.println();
    }
}

public class reverse{
    public static void main (String [] args){
        LinkedList list=new LinkedList();

        list.insertAtBeg(7);
        list.insertAtBeg(6);
        list.insertAtEnd(8);
        list.insertAtEnd(9);
        list.insert(9,10);

        list.print();

        list.reverse();
        System.out.println("AFter resverse: ");
        list.print();
        
    }
}