class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {
        // Your code here
        if(arr==null||arr.length==0)
        return 0;
        
        int sum=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            sum=Math.max(arr[i],sum+arr[i]);
            max=Math.max(max,sum);
        }
        return max;
    }
}