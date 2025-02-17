class Solution {
    public boolean isBalanced(Node root) {
        // code here
        return isBalancedRec(root)>0;
    }
    
    static int isBalancedRec(Node root) 
    {
        if(root==null)
        return 0;
        
        int lHeight=isBalancedRec(root.left);
        int rHeight=isBalancedRec(root.right);

        if(lHeight==-1 || rHeight==-1 || Math.abs(lHeight-rHeight)>1)
        return -1;

        return Math.max(lHeight,rHeight)+1;
    }
}