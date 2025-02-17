class Solution {
    public static boolean isSymmetric(Node root) {
        // your code here;
        if(root==null)
        return true;
        return isMirror(root.left,root.right);
    }
    
    static boolean isMirror(Node leftSub,Node rightSub) 
    {
        if(leftSub==null && rightSub==null)
        return true;

        if(leftSub==null || rightSub==null || leftSub.data!=rightSub.data)
        return false;

        return isMirror(leftSub.left,rightSub.right) && isMirror(leftSub.right,rightSub.left);
    }
}