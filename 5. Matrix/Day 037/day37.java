class Solution {
    // Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int mat[][]) {
        // code here
        int m=mat.length;
        for(int i=0;i<m;i++) 
        {
            int start=0;
            int end=m-1;
            while(start<end) 
            {
                int temp=mat[i][start];
                mat[i][start]=mat[i][end];
                mat[i][end]=temp;
                start++;
                end--;
            }
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<i;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }
}