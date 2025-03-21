class Solution {
    static int maxProfit(int prices[], int k) {
        // code here
        int n=prices.length;
        int dp[][]=new int[k+1][n];
        for(int i=1;i<=k;i++)
        {
            int maxDiff=-prices[0];
            for(int j=1;j<n;j++)
            {
                dp[i][j]=Math.max(dp[i][j-1],prices[j]+maxDiff);
                maxDiff=Math.max(maxDiff,dp[i-1][j]-prices[j]);
            }
        }
        return dp[k][n-1];
    }
}