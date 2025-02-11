class Solution {
    public static Node buildTree(int inorder[], int preorder[]) {
        // code here
        return buildTreeHelper(inorder,preorder,0,inorder.length-1,new int[]{0});
    }
    
    private static Node buildTreeHelper(int inorder[],int preorder[],int inStart,int inEnd,int preIndex[])
    {
        if(inStart>inEnd)
        return null;
        
        Node root=new Node(preorder[preIndex[0]]);
        preIndex[0]++;
        int inIndex=0;
        for(int i=inStart;i<=inEnd;i++)
        {
            if(inorder[i]==root.data)
            {
                inIndex=i;
                break;
            }
        }
        root.left=buildTreeHelper(inorder,preorder,inStart,inIndex-1,preIndex);
        root.right=buildTreeHelper(inorder,preorder,inIndex+1,inEnd,preIndex);
        return root;
    }
}