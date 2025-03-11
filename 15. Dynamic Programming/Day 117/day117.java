class Solution {
    int countWays(int n) {
        // your code here
        int a=1,b=1; 
        for(int i=2;i<=n;i++)
        { 
            int temp=a+b; 
            a=b; 
            b=temp; 
        } 
        return b; 
    }
}