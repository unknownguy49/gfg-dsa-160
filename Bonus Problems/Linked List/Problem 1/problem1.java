class Intersect {
    // Function to find intersection point in Y shaped Linked Lists.
    static Node intersectPoint(Node head1, Node head2) {
        // code here
        Node ptr1=head1;
        Node ptr2=head2;

        if(ptr1==null||ptr2==null)
        return null;

        while(ptr1!=ptr2) 
        {
            ptr1=(ptr1!=null)?ptr1.next:head2;
            ptr2=(ptr2!=null)?ptr2.next:head1;
        }

        return ptr1;
    }
}