class Solution {
    Node first,second,prev;
    void correctBST(Node root) {
        // code here.
        first=second=prev=null;
        inorder(root);
        
        if(first!=null&&second!=null)
        {
            int temp=first.data;
            first.data=second.data;
            second.data=temp;
        }
    }

    private void inorder(Node node)
    {
        if(node==null)
        return;
        
        inorder(node.left);
        if(prev!=null&&prev.data>node.data)
        {
            if(first==null)
            {
                first=prev;
                second=node;
            }
            else 
            second=node;
        }
        prev=node;
        inorder(node.right);
    }
}