class Solution {
    public static Node reverseKGroup(Node head, int k) {
        // code here
        if(head==null || k==1) 
        return head;

        Node t=new Node(0);
        t.next=head;
        Node pre=t,cur=t,nex=t;

        int count=0;
        while(cur.next!=null) 
        {
            cur=cur.next;
            count++;
        }

        while(count>=k)
        {
            cur=pre.next;
            nex=cur.next;
            for(int i=1;i<k;i++) 
            {
                cur.next=nex.next;
                nex.next=pre.next;
                pre.next=nex;
                nex=cur.next;
            }
            pre=cur;
            count-=k;
        }
        
        if(count>0) 
        {
            cur=pre.next;
            nex=cur.next;
            while(nex!=null) 
            {
                cur.next=nex.next;
                nex.next=pre.next;
                pre.next=nex;
                nex=cur.next;
            }
        }
        
        return t.next;
    }
}