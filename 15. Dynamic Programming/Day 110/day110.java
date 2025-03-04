class Solution {
    static int lis(int arr[]) {
        // code here
        int n=arr.length,maxLen=1;
        int dp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            dp[i]=1;
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[i]>arr[j])
                dp[i]=Math.max(dp[i],dp[j]+1);
            }
            maxLen=Math.max(maxLen,dp[i]);
        }
        return maxLen;
    }
}