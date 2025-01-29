class Solution {
    // Function to merge K sorted linked list.
    Node mergeKLists(List<Node> arr) {
        // Add your code here.
        if(arr.size()==0) 
        return null;

        return mergeListsRecur(0,arr.size()-1,arr);
    }
    
    Node mergeListsRecur(int i,int j,List<Node> arr) 
    {
        if(i==j) 
        return arr.get(i);
        
        int mid=i+(j-i)/2;

        Node head1=mergeListsRecur(i,mid,arr);
        Node head2=mergeListsRecur(mid+1,j,arr);
        Node head=mergeTwo(head1,head2);
        return head;
    }
    
    Node mergeTwo(Node head1,Node head2) 
    {
        Node dummy=new Node(-1);
        Node curr=dummy;

        while(head1!=null&&head2!=null) 
        {
            if(head1.data<=head2.data) 
            {
                curr.next=head1;
                head1=head1.next;
            } 
            else 
            {
                curr.next=head2;
                head2=head2.next;
            }
            curr=curr.next;
        }

        if(head1!=null)
        curr.next=head1;
        else
        curr.next=head2;
        return dummy.next;
    }
}