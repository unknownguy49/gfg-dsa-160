class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        // code here
        if(head==null||head.next==null)
        return;
        Node slow=head,fast=head;
        slow=slow.next;
        fast=fast.next.next;
        while(fast!=null&&fast.next!=null)
        {
            if(slow==fast)
            break;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(slow!=fast)
        return;
        
        slow=head;
        if(slow==fast)
        {
            while(fast.next!=slow)
            fast=fast.next;
        }
        else
        {
            while(slow.next!=fast.next)
            {
                slow=slow.next;
                fast=fast.next;
            }
        }
        fast.next=null;
    }
}