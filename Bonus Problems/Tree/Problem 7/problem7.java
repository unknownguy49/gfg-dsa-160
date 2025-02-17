class Solution {
    public static int supplyVaccine(Node root) {
        // Your code here
        int res[]=new int[1];
        if(minVaccine(root,res)==0)
        res[0]++;

        return res[0];
    }
    
    static int minVaccine(Node root,int res[]) 
    {
        if(root==null) 
        return 1;

        int left=minVaccine(root.left,res);
        int right=minVaccine(root.right,res);

        if(left==0 || right==0) 
        {
            res[0]++;
            return 2;
        }

        if(left==2 || right==2)
        return 1;
        
        return 0;
    }
}