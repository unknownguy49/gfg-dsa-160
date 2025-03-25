class Solution {
    static int countWays(String s) {
        // code here
        int n=s.length();
        int dpTrue[][]=new int[n][n];
        int dpFalse[][]=new int[n][n];
        for(int i=0;i<n;i+=2)
        {
            dpTrue[i][i]=s.charAt(i)=='T'?1:0;
            dpFalse[i][i]=s.charAt(i)=='F'?1:0;
        }
        
        for(int len=3;len<=n;len+=2)
        {
            for(int i=0;i<=n-len;i+=2)
            {
                int j=i+len-1;
                for(int k=i+1;k<j;k+=2)
                {
                    int lt=dpTrue[i][k-1],lf=dpFalse[i][k-1],rt=dpTrue[k+1][j],rf=dpFalse[k+1][j];
                    if(s.charAt(k)=='&')
                    {
                        dpTrue[i][j]+=lt*rt;
                        dpFalse[i][j]+=lt*rf+lf*rt+lf*rf;
                    }
                    else if(s.charAt(k)=='|')
                    {
                        dpTrue[i][j]+=lt*rt+lt*rf+lf*rt;
                        dpFalse[i][j]+=lf*rf;
                    }
                    else
                    {
                        dpTrue[i][j]+=lt*rf+lf*rt;
                        dpFalse[i][j]+=lt*rt+lf*rf;
                    }
                }
            }
        }
        return dpTrue[0][n-1];
    }
}