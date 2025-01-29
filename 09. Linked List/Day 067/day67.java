class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node t=new Node(0);
        Node tail=t;
        while(head1!=null&&head2!=null)
        {
            if(head1.data<=head2.data)
            {
                tail.next=head1;
                head1=head1.next;
            }
            else
            {
                tail.next=head2;
                head2=head2.next;
            }
            tail=tail.next;
        }
        if(head1!=null)
        tail.next=head1;
        else if(head2!=null)
        tail.next=head2;
        return t.next;
    }
}