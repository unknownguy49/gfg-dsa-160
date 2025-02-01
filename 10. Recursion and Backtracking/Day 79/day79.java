class Solution {
    static public boolean isWordExist(char[][] mat, String word) {
        // Code here
        int rows=mat.length;
        int cols=mat[0].length;
        boolean visited[][]=new boolean[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(mat[i][j]==word.charAt(0)&&search(mat,word,i,j,0,visited))
                return true;
            }
        }
        return false;
    }
    
    private static boolean search(char mat[][],String word,int i,int j,int index,boolean visited[][])
    {
        if(index==word.length())
        return true;
        
        if(i<0||i>=mat.length||j<0||j>=mat[0].length||mat[i][j]!=word.charAt(index)||visited[i][j])
        return false;
        visited[i][j]=true;
        if(search(mat,word,i+1,j,index+1,visited)||search(mat,word,i-1,j,index+1,visited)||search(mat,word,i,j+1,index+1,visited)||search(mat,word,i,j-1,index+1,visited))
        return true;
        visited[i][j]=false;
        return false;
    }
}