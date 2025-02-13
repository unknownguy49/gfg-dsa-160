class Solution {
    boolean findTarget(Node root, int target) {
        // Write your code here
        Set<Integer> set=new HashSet<>();
        return findPair(root,target,set);
    }

    private boolean findPair(Node node,int target,Set<Integer> set)
    {
        if(node==null)
        return false;
        
        if(set.contains(target-node.data))
        return true;
        
        set.add(node.data);
        return findPair(node.left,target,set)||findPair(node.right,target,set);
    }
}