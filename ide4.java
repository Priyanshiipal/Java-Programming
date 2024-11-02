/*Insert a Node
Inserting an element in between the elements in an array requires you to shift the elements to the left but in Linked list it is just about modifying few links. Let's practice inserting a node in a linked list, but there is a rule:
You are given a sorted(ascending order) linked list and you have to insert a node in the list in a sorted manner.
For example - if the given list is 
HEAD->2->3->6->8->NULL and you have to insert 4,you will insert it after 3
 and your modified list will look something like this 
HEAD->2->3->4->6->8->NULL.

Note - You only need to implement insertSortedNode(), and return the head of the modified linked list.

Input Format
The first line contains an integer T, number of test cases. Then follows T test cases. Each test case consists of three lines.The first line contains 
N, size of the list.The second line contains N space-separated positive integers denoting elements of the list.The third line contains an integer denoting the data value to be inserted.

Output Format
The output contains 
T lines, each line containing the modified list.
Note - Your task is to return the head of the modified linked list

Constraints
1<=T<=10

1<=N<=100

1<=Ai<=100

Time Limit
1 second

Example
Input
2
4
1 2 4 5
3
3
1 1 1
2

Output
1 2 3 4 5
1 1 1 2
*/





// Complete the insertSortedNode function below.

/*
For your reference:

SinglyLinkedListNode {
int data;
SinglyLinkedListNode next;
}
To create a new node use below constructor
public SinglyLinkedListNode(int nodeData)
*/
static SinglyLinkedListNode insertSortedNode(SinglyLinkedListNode head,int value) {
    //write your code here
    SinglyLinkedListNode newNode=new SinglyLinkedListNode(value);
    
    if(head==null || value<=head.data){
      newNode.next=head;
      head= newNode;
    }
    
    SinglyLinkedListNode current=head;
    while(current.next!=null && current.next.data<value){
      current=current.next;
    }
    
    newNode.next=current.next;
    current.next=newNode;
    
    return head;
      
}

