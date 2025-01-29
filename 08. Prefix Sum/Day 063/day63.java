class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        int n=arr.length,maxLen=0,sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            sum+=arr[i]==1?1:-1;
            if(sum==0) 
            maxLen=i+1;
            else if(map.containsKey(sum)) 
            maxLen=Math.max(maxLen,i-map.get(sum));
            else 
            map.put(sum,i);
        }
        return maxLen;
    }
}