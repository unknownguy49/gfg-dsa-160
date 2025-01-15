class Solution {
    public int minRemovals(int[] arr, int k) {
        // code here
        int total=0,n=arr.length;
        for(int num:arr)
        {
            total+=num;
        }
        
        int target=total-k;
        
        if(target==0)
        return n;

        int left=0,currSum=0,maxLen=-1;

        for(int right=0;right<n;right++) 
        {
            currSum+=arr[right];
            while(left<right && currSum>target) 
            currSum-=arr[left++];
    
            if(currSum==target) 
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen==-1?-1:n- maxLen;
    }
}