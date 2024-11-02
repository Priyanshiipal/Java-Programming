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
        Node n =new Node(data);
        n.next=head;
        head=n;

    }

    void insertAtEnd(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
        }
        Node tempNode=head;
        while(tempNode.next!=null){
            tempNode=tempNode.next;
        }
        tempNode.next=n;
    }

    void delete(int num){
        Node currentNode=head;
        Node prevNode=null;

        while(currentNode!=null && currentNode.data!=num){
            prevNode=currentNode;
            currentNode=currentNode.next;
        }
        if(currentNode==head){
            if(head==null){
                System.out.print("Empty list");
                return;
            }
            head=head.next;
            return;
        }
        prevNode.next=currentNode.next;
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

public class delete{
    public static void main (String[] args){
        LinkedList list = new LinkedList();

        list.insertAtBeg(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);

        list.print();
        list.delete(4);
        list.print();
        list.delete(1);
        list.print();
        list.delete(6);
        list.print();
    }
}