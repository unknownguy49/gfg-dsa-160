class Solution {
    public int findMaxSum(int arr[]) {
        // code here
        int n=arr.length;
        if(n==1)
        return arr[0];
        
        int prev2=0,prev1=arr[0];
        for(int i=1;i<n;i++)
        {
            int curr=Math.max(prev1,prev2+arr[i]);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}