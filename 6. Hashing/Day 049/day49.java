class Solution {
    public int countSubarrays(int arr[], int k) {
        // code here
        int c=0;
        int prefixSum=0;
        HashMap<Integer,Integer> prefixSumCount=new HashMap<>();
        prefixSumCount.put(0,1);
        
        for(int num:arr) 
        {
            prefixSum+=num;
            if(prefixSumCount.containsKey(prefixSum-k)) 
            c+=prefixSumCount.get(prefixSum-k);

            prefixSumCount.put(prefixSum,prefixSumCount.getOrDefault(prefixSum,0)+1);
        }
        return c;
    }
}