class Solution {

    public int minCoins(int coins[], int sum) {
        // code here
        int dp[]=new int[sum+1]; 
        Arrays.fill(dp,Integer.MAX_VALUE); 
        dp[0]=0; 
        for(int coin:coins)
        { 
            for(int j=coin;j<=sum;j++) 
            {
                if(dp[j-coin]!=Integer.MAX_VALUE) 
                dp[j]=Math.min(dp[j],dp[j-coin]+1); 
            }
        } 
        return dp[sum]==Integer.MAX_VALUE?-1:dp[sum];
    }
}