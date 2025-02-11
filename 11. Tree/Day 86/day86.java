class Solution {
    ArrayList<Integer> boundaryTraversal(Node node) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        if(node==null)
        return result;
        
        result.add(node.data);
        leftBoundary(node.left,result);
        leafNodes(node.left,result);
        leafNodes(node.right,result);
        rightBoundary(node.right,result);
        return result;
    }
    
    void leftBoundary(Node node,ArrayList<Integer> result)
    {
        if(node==null||(node.left==null&&node.right==null))
        return;
        
        result.add(node.data);
        
        if(node.left!=null)
        leftBoundary(node.left,result);
        else 
        leftBoundary(node.right,result);
    }
    
    void leafNodes(Node node,ArrayList<Integer> result)
    {
        if(node==null)
        return;
        
        if(node.left==null&&node.right==null)
        {
            result.add(node.data);
            return;
        }
        leafNodes(node.left,result);
        leafNodes(node.right,result);
    }
    
    void rightBoundary(Node node,ArrayList<Integer> result)
    {
        if(node==null||(node.left==null&&node.right==null))
        return;
        
        if(node.right!=null)
        rightBoundary(node.right,result);
        else 
        rightBoundary(node.left,result);
        result.add(node.data);
    }
}