class Solution {
    static boolean equalPartition(int arr[]) {
        // code here
        int sum=0; 
        for(int num:arr)
        {
            sum+=num;
        }
        if(sum%2!=0)
        return false; 
        
        sum/=2; 
        boolean dp[]=new boolean[sum+1]; 
        dp[0]=true; 
        for(int num:arr)
        {
            for(int j=sum;j>=num;j--)
            {
                dp[j]=dp[j]||dp[j-num];
            }
        }
        return dp[sum]; 
    }
}