class Solution {
    // Function to return maximum path sum from any node in a tree.
    int findMaxSum(Node node) {
        // your code goes here
        int maxSum[]=new int[1];
        maxSum[0]=Integer.MIN_VALUE;
        helper(node,maxSum);
        return maxSum[0];
    }
    
    int helper(Node node,int maxSum[])
    {
        if(node==null) 
        return 0;
        
        int left=Math.max(0,helper(node.left,maxSum));
        int right=Math.max(0,helper(node.right,maxSum));
        maxSum[0]=Math.max(maxSum[0],node.data+left+right);
        
        return node.data+Math.max(left,right);
    }
}