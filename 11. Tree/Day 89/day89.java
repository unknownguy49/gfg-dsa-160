class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        // code here.
        return isBSTUtil(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    private boolean isBSTUtil(Node node,long min,long max)
    {
        if(node==null)
        return true;
        
        if(node.data<=min||node.data>=max)
        return false;
        return isBSTUtil(node.left,min,node.data)&&isBSTUtil(node.right,node.data,max);
    }
}