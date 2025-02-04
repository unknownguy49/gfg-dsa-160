class Solution {
    int diameter;
    int diameter(Node root) {
        // Your code here
        diameter=0;
        height(root);
        return diameter;
    }

    private int height(Node node) 
    {
        if(node==null) 
        return 0;
        
        int leftHeight=height(node.left);
        int rightHeight=height(node.right);
        diameter=Math.max(diameter,leftHeight+rightHeight);
        return Math.max(leftHeight,rightHeight)+1;
    }
}