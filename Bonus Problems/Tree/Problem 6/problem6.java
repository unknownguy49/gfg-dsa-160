class Solution {
    int getCount(Node root, int l, int h) {
        // Your code here
        if (root==null) 
        return 0;

        if(root.data<=h && root.data>=l)
        return 1+getCount(root.left,l,h)+getCount(root.right,l,h);

        else if(root.data<l)
        return getCount(root.right,l,h);
        
        else
        return getCount(root.left,l,h);
    }
}