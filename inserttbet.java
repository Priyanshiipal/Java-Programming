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

    void insertAtBeg(int data) {
        Node n=new Node(data);
        n.next=head;
        head=n;
    }

    void insert(int num, int data){
        Node tempNode=head;
        while(tempNode!=null && tempNode.data!=num){
            tempNode=tempNode.next;
        }
        Node n=new Node(data);
        n.next=tempNode.next;
        tempNode.next=n;
    }

    void display(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data + " ");
            current=current.next;
            
        }
        System.out.println();
    }

}

public class inserttbet{
    public static void main(String[] args){
        LinkedList list= new LinkedList();

        list.insertAtBeg(4);
        list.insertAtBeg(5);
        list.insertAtBeg(6);
        list.insertAtBeg(8);
        list.insertAtBeg(9);list.insertAtBeg(10);list.insertAtBeg(11);
        list.insert(9, 6);

        list.display();
    }
}