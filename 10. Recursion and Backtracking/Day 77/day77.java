class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        int board[]=new int[n];
        solveNQueens(result,board,0,n);
        return result;
    }

    private void solveNQueens(ArrayList<ArrayList<Integer>> result,int board[],int col,int n)
    {
        if(col==n)
        {
            ArrayList<Integer> solution=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                solution.add(board[i]+1);
            }
            result.add(solution);
            return;
        }
        for(int row=0;row<n;row++)
        {
            if(isSafe(board,row,col))
            {
                board[col]=row;
                solveNQueens(result,board,col+1,n);
            }
        }
    }

    private boolean isSafe(int[] board,int row,int col)
    {
        for(int i=0;i<col;i++)
        {
            if(board[i]==row||Math.abs(board[i]-row)==Math.abs(i-col))
            return false;
        }
        return true;
    }
}