class Solution {
    static int longestSubarray(int[] arr, int k) {
        // Code Here
        int n=arr.length;
        Map<Integer, Integer> prefIdx=new HashMap<>();
        int sum=0,res=0;

        for(int i=0;i<n;i++) 
        {
            sum+=(arr[i]>k?1:-1);

            if(!prefIdx.containsKey(sum))
            prefIdx.put(sum, i);
        }
        
        if(prefIdx.containsKey(-n))
        return 0;
      
        prefIdx.put(-n,n);

        for(int i=-n+1;i<=n;i++) 
        {
            if(!prefIdx.containsKey(i))
            prefIdx.put(i,prefIdx.get(i-1));
            else
            prefIdx.put(i,Math.min(prefIdx.get(i),prefIdx.get(i-1)));
        }

        sum=0;
        for(int i=0;i<n;i++) 
        {
            sum+=(arr[i]>k?1:-1);
            if(sum>0)
            res=i+1;
            else 
            res=Math.max(res,i-prefIdx.get(sum-1));
        }
        return res;
    }
}