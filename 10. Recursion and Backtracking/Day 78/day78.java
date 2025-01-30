class Solution {
    // Function to find a solved Sudoku.
    static void solveSudoku(int[][] mat) {
        // code here
        solve(mat);
    }
    
    private static boolean solve(int mat[][])
    {
        for(int row=0;row<9;row++)
        {
            for(int col=0;col<9;col++)
            {
                if(mat[row][col]==0)
                {
                    for(int num=1;num<=9;num++)
                    {
                        if(isSafe(mat,row,col,num))
                        {
                            mat[row][col]=num;
                            if(solve(mat))return true;
                            mat[row][col]=0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isSafe(int mat[][],int row,int col,int num)
    {
        for(int x=0;x<9;x++)
        {
            if(mat[row][x]==num||mat[x][col]==num||mat[row-row%3+x/3][col-col%3+x%3]==num)
            return false;
        }
        return true;
    }
}