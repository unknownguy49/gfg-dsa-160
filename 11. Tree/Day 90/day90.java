class Solution {
    // Return the Kth smallest element in the given BST
    public int kthSmallest(Node root, int k) {
        // Write your code here
        int res[]=new int[2];
        inorder(root,k,res);
        return res[1]==0?-1:res[1];
    }

    private void inorder(Node node,int k,int res[])
    {
        if(node==null||res[0]>=k)
        return;
        
        inorder(node.left,k,res);
        res[0]++;
        
        if(res[0]==k){res[1]=node.data;return;}
        inorder(node.right,k,res);
    }
}