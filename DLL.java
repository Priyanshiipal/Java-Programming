class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;

    }
}

class DoublyLinkedList{
    Node head=null;

    void insertBeg(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            return;
        }
        n.next=head;
        head.prev=n;
        head=n;
    }

    void insertEnd(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
        n.prev=temp;

    }

    void insertAfter(int num, int data){
        Node temp=head;
        while(temp!=null && temp.data!=num){
            temp=temp.next;
        }
        Node n=new Node(data);
        n.next=temp.next;
        n.next.prev=n;
        temp.next=n;
        n.prev=temp;
    }

    void delete(int data){
        Node delNode=head;
        while(delNode!=null && delNode.data!=data){
            delNode=delNode.next;
        }

        if(head==null){
            System.out.println("Empty list");
            return;
        }

        if(delNode==head){
            head=head.next;
            head.prev=null;
            return;
        }

        delNode.prev.next=delNode.next;
        if(delNode.next!=null){
        delNode.next.prev=delNode.prev;
        }

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

public class DLL{
    public static void main(String[] args){
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.insertBeg(3);
        dll.insertEnd(6);
        dll.insertAfter(3,4);
        dll.insertAfter(4,5);
        dll.delete(6);
        dll.print();
    
    }
}