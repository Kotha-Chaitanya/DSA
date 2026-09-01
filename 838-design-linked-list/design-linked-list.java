class Node
{
    int data;
    Node next;
    Node(int data)
    {
        
        this.data=data;
        this.next=null;
    }

}
class MyLinkedList {

   Node head;
    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        Node temp=head;
        int c=0;
        while(temp!=null)
        {
            if(c==index)
            {
                return temp.data;
            }
            c++;
            temp=temp.next;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
      Node n=new Node(val);
      if(head==null)
      {
        head=n;
      }
      else
      {
        n.next=head;
        head=n;
      }
    }
    
    public void addAtTail(int val) {
        Node temp=head;
        Node n=new Node(val);
        if(head==null)
        {
            head=n;
            return;
        }
        while(temp.next!=null)
        {
           temp=temp.next;
        }
         temp.next=n;
    }
    
    public void addAtIndex(int index, int val) {
        int c=0;
        Node n=new Node(val);
        // if(head==null)
        // {
        //     head=n;
        //     return;
        // }
        if(index==0)
        {
        n.next=head;
        head=n;
        return;
        }
        Node temp=head;
        while(temp!=null)
        {
            if(c==index-1)
            {
                n.next=temp.next;
                temp.next=n;
                return;
            }
            c++;
            temp=temp.next;
        }
    }
    
    public void deleteAtIndex(int index) {
        int c=0;
        if(head==null)
        {
            return;
        }
        if(index==0)
        {
            head=head.next;
            return;
        }
        Node temp=head;
        while(temp!=null && temp.next!=null)
        {
            if(c==index-1)
            {
                temp.next=temp.next.next;
                return;
            }
            c++;
            temp=temp.next;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */