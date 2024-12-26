class Solution {
    public static int findMinOperation(int[][] mat) {
        // code here
        int n=mat.length;
        int res=0;
        int maxSum=0;
        for(int i=0;i<n;i++) 
        {
            int sum=0;
            for(int j=0;j<n;j++) 
            {
                sum+=mat[i][j];
            }
            maxSum=Math.max(sum,maxSum);
        }

        for(int j=0;j<n;j++) 
        {
            int sum=0;
            for(int i=0;i<n;i++) 
            {
                sum+=mat[i][j];
            }
            maxSum=Math.max(sum,maxSum);
        }

        for(int i=0;i<n;i++) 
        {
            int sum=0;
            for(int j=0;j<n;j++) 
            {
                sum+=mat[i][j];
            }
            res+=(maxSum-sum);
        }
        return res;
    }
}