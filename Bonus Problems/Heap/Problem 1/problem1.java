class Solution {
    public ArrayList<Integer> topKFrequent(int[] arr, int k) {
        // Your code here
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num:arr) 
        {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        int maxFreq=0;
        for(Map.Entry<Integer,Integer> entry:freq.entrySet()) 
        {
            maxFreq=Math.max(maxFreq,entry.getValue());
        }

        ArrayList<ArrayList<Integer>> buckets=new ArrayList<>();
        for(int i=0;i<=maxFreq;i++) 
        {
            buckets.add(new ArrayList<>());
        }

        for(Map.Entry<Integer,Integer> entry:freq.entrySet()) 
        {
            buckets.get(entry.getValue()).add(entry.getKey());
        }

        ArrayList<Integer> res=new ArrayList<>();
        for(int i=maxFreq;i>=1;--i) 
        {
            Collections.sort(buckets.get(i),Collections.reverseOrder());
            for(int num:buckets.get(i)) 
            {
                res.add(num);
                if(res.size()==k) 
                return res;
            }
        }

        return res;
    }
}