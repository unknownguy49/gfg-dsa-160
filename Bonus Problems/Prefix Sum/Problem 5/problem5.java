class Solution {
    int longestSubarrayDivK(int[] arr, int k) {
        // Complete the function
        int n=arr.length,res=0;
        Map<Integer, Integer> prefIdx=new HashMap<>();
        int sum=0;

        for(int i=0;i<n;i++) 
        {
            sum=((sum+arr[i])%k+k)%k;

            if(sum==0)
            res=i+1;
            else if(prefIdx.containsKey(sum))
            res=Math.max(res,i-prefIdx.get(sum));
            else
            prefIdx.put(sum, i);
        }
        return res;
    }
}