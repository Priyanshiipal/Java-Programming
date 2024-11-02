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
    n.next=head;
    head=n;
    }

    void insertAtEnd(int data){
        Node n= new Node(data);

        if(head==null){
            head=n;
        }
        Node tempNode=head;
        while(tempNode.next!=null){
            tempNode=tempNode.next;

        }
        tempNode.next=n;
    }
     

     //deleting first node of SLL
    void delete(int key){
        Node tempNode=head;
        while(tempNode!=null && tempNode.data!=key){
            tempNode=tempNode.next;

        } 
        if(tempNode==head){
            if(head==null){
                System.out.print("Empty list");
                return;
            }
            head=head.next;
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

public class delfirst{
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.insertAtBeg(7);
        list.insertAtBeg(12);
        list.insertAtBeg(50);
        list.insertAtBeg(6);
        list.insertAtEnd(8);
        list.insertAtEnd(9);
        list.insertAtEnd(43);
        list.print();
        list.delete(6);
        list.delete(50);
        list.print();


    }
}