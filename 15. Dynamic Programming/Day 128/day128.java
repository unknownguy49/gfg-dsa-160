class Solution {
    int maxValue(int[] arr) {
        // code here
        int n=arr.length;
        if(n==1)
        return arr[0];
        return Math.max(rob(arr,0,n-2),rob(arr,1,n-1));
    }
    
    int rob(int arr[],int start,int end)
    {
        int prev2=0,prev1=0;
        for(int i=start;i<=end;i++)
        {
            int curr=Math.max(prev1,prev2+arr[i]);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}