class Solution {
    public int[][] generateMatrix(int[] rowSum, int[] colSum) {
        // code here
        int n=rowSum.length,m=colSum.length;
        int[][] res=new int[n][m];
        int i=0,j=0;
        while(i<n && j<m)
        {
            res[i][j]=Math.min(rowSum[i],colSum[j]);
            rowSum[i]-=res[i][j];
            colSum[j]-=res[i][j];
            if(rowSum[i]==0)
            i++;
            if(colSum[j]==0)
            j++;
        }
        return res;
    }
}