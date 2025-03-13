class Solution {
    static int knapsack(int W, int val[], int wt[]) {
        // code here
        int n=val.length;
        int dp[][]=new int[n+1][W+1]; 
        for(int i=1;i<=n;i++)
        { 
            for(int j=1;j<=W;j++)
            { 
                if(wt[i-1]<=j)
                dp[i][j]=Math.max(dp[i-1][j],val[i-1]+dp[i-1][j-wt[i-1]]); 
                else 
                dp[i][j]=dp[i-1][j]; 
            } 
        } 
        return dp[n][W];
    }
}