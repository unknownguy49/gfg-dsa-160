class Solution {
    public int sumK(Node root, int k) {
        // code here
        if(root==null)
        return 0;
        
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        
        return countPaths(root,0,k,map);
    }

    private int countPaths(Node node,int currSum,int k,Map<Integer,Integer> map)
    {
        if(node==null)
        return 0;
        
        currSum+=node.data;
        int count=map.getOrDefault(currSum-k,0);
        map.put(currSum,map.getOrDefault(currSum,0)+1);
        count+=countPaths(node.left,currSum,k,map);
        count+=countPaths(node.right,currSum,k,map);
        map.put(currSum,map.get(currSum)-1);
        
        return count;
    }
}