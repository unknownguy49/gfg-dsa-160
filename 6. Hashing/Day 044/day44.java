class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++) 
        {
            Map<Integer,List<Integer>> map=new HashMap();
            for(int k=i+1;k<arr.length;k++) 
            {
                int target=-(arr[i]+arr[k]);
                if (map.containsKey(target)) 
                {
                    for(int j:map.get(target)) 
                    {
                        ans.add(Arrays.asList(i,j,k));
                    }
                }

                map.computeIfAbsent(arr[k],key -> new ArrayList<>()).add(k);
            }
        }
        return ans;
    }
}