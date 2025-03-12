class Solution {
    static int minCostClimbingStairs(int[] cost) {
        // Write your code here
        int a=cost[0],b=cost[1]; 
        for(int i=2;i<cost.length;i++)
        { 
            int temp=Math.min(a,b)+cost[i]; 
            a=b; 
            b=temp; 
        } 
        return Math.min(a,b); 
    }
}