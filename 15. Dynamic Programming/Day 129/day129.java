class Solution {
    public int countWays(String digits) {
        // code here
        int n=digits.length();
        if(n==0||digits.charAt(0)=='0')
        return 0;
        
        int[]dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            int oneDigit=Integer.parseInt(digits.substring(i-1,i));
            int twoDigits=Integer.parseInt(digits.substring(i-2,i));
            if(oneDigit>=1&&oneDigit<=9)
            dp[i]+=dp[i-1];
            if(twoDigits>=10&&twoDigits<=26)
            dp[i]+=dp[i-2];
        }
        return dp[n];
    }
}