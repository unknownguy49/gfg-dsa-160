class Solution {
    public Node cloneLinkedList(Node head) {
        // code here
        if(head==null) 
        return null;
        
        Node curr=head;
        while(curr!=null) 
        {
            Node temp=new Node(curr.data);
            temp.next=curr.next;
            curr.next=temp;
            curr=temp.next;
        }
        
        curr=head;
        while(curr!=null) 
        {
            if(curr.random!=null) 
            curr.next.random=curr.random.next;
            curr=curr.next.next;
        }
        Node original=head,copy=head.next;
        Node tempHead=copy;
        
        while(original!=null) 
        {
            original.next=original.next.next;
            if(copy.next!=null) 
            copy.next=copy.next.next;
            original=original.next;
            copy=copy.next;
        }
        return tempHead;
    }
}