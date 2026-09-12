/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
       Node temp=head;
       Node slow=head;
       Node fast=head;
       if(head==null)
       return head.data;
       while(fast!=null  &&  fast.next!=null )
       {
           slow=slow.next;
           fast=fast.next.next;
       }
       return slow.data;
        
    }
}