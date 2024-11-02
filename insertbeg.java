//package linkedlistds;

class Node{
    int data;
    Node next;  //

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

 class LinkedList{

    Node head=null;

    void insertAtBeg(int data){
        Node newNode= new Node(data);
        newNode.next=head;
        head=newNode;
    }

    void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data + " ");
            current=current.next;

        }
        System.out.println();
    }

}

public class insertbeg{
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.insertAtBeg(5);
        list.insertAtBeg(8);

        System.out.print("list:");
        list.display();
    }
}