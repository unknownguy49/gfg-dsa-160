class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0,maxLength=0;
        map.put(0,-1);
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            
            if(map.containsKey(sum-k)) 
            maxLength=Math.max(maxLength,i-map.get(sum-k));
            
            if(!map.containsKey(sum)) 
            map.put(sum,i);
        }
        return maxLength;
    }
}