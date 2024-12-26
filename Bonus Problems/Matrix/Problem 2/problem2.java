class Solution {
    public int[][] spiralFill(int n, int m, int[] arr) {
        // code here
        int[][] res=new int[n][m];
        int top=0,bottom=n-1,left=0,right=m-1;
        int index=0;
        while(index<arr.length) 
        {
            for(int j=left;j<=right;j++) 
            {
                res[top][j]=arr[index++];
            }
            top++;

            for(int i=top;i<=bottom;i++) 
            {
                res[i][right]=arr[index++];
            }
            right--;

            if(top<=bottom) 
            {
                for(int j=right;j>=left;j--) 
                {
                    res[bottom][j]=arr[index++];
                }
                bottom--;
            }

            if(left<=right) 
            {
                for(int i=bottom;i>=top;i--) 
                {
                    res[i][left]=arr[index++];
                }
                left++;
            }
        }
        return res;
    }
}