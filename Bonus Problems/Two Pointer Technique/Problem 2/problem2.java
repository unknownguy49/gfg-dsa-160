class Solution {
    static int closest3Sum(int[] arr, int target) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        int res=0;
        int minDiff=Integer.MAX_VALUE;

        for(int i=0;i<n-2;i++) 
        {
            int l=i+1,r=n-1;

            while(l<r) 
            {
                int currSum=arr[i]+arr[l]+arr[r];
                
                if(Math.abs(currSum-target)<minDiff) 
                {
                    minDiff=Math.abs(currSum-target);
                    res=currSum;
                }
                
                else if(Math.abs(currSum-target)==minDiff) 
                res=Math.max(res, currSum);

                if(currSum>target)
                r--;
                else
                l++;
            }
        }

        return res;
    }
}