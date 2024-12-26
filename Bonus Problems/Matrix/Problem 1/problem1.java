class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
        int n=mat.length;
        for(int i=0;i<n/2;i++) 
        {
            for(int j=0;j<n;j++) 
            {
                int temp=mat[i][j];
                mat[i][j]=mat[n-i-1][n-j-1];
                mat[n-i-1][n-j-1]=temp;
            }
        }

        if(n%2!=0) 
        {
            int mid=n/2;
            for(int j=0;j<n/2;j++) 
            {
                int temp=mat[mid][j];
                mat[mid][j]=mat[mid][n-j-1];
                mat[mid][n-j-1]=temp;
            }
        }
    }
}