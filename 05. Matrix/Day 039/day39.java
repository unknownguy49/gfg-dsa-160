class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        // code here
        for(int[] r:mat)
        {
            int l=0,r1=r.length-1;
            while(l<=r1)
            {
                int m=l+(r1-l)/2;
                if(r[m]==x)
                return true;
                else if(r[m]<x)
                l=m+1;
                else    
                r1=m-1;
            }
        }
        return false;
    }
}