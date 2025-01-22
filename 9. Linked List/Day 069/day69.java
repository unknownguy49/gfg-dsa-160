class Solution {
    static Node addTwoLists(Node num1, Node num2) {
        // code here
        num1=reverse(num1);
        num2=reverse(num2);
        Node dummy=new Node(0);
        Node temp=dummy;
        int carry=0;
        while(num1!=null||num2!=null||carry!=0)
        {
            int sum=carry;
            if(num1!=null)
            {
                sum+=num1.data;
                num1=num1.next;
            }
            if(num2!=null)
            {
                sum+=num2.data;
                num2=num2.next;
            }
            carry=sum/10;
            temp.next=new Node(sum%10);
            temp=temp.next;
        }
        Node result=reverse(dummy.next);
        while(result!=null&&result.data==0)
        {
            result=result.next;
        }
        return result;
    }
    
    static Node reverse(Node head)
    {
        Node prev=null,current=head,next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
}