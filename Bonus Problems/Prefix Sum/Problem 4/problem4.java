class Solution {
    // Function to count the number of subarrays with a sum that is divisible by K
    public int subCount(int[] arr, int k) {
        // code here
        int n=arr.length,res=0;
        Map<Integer, Integer> prefCnt=new HashMap<>();
        int sum=0;

        for(int i=0;i<n;i++) 
        {
            sum=((sum+arr[i])%k+k)%k;
            if(sum==0)
            res+=1;

            res+=prefCnt.getOrDefault(sum,0);
            prefCnt.put(sum,prefCnt.getOrDefault(sum,0)+1);
        }
        return res;
    }
}