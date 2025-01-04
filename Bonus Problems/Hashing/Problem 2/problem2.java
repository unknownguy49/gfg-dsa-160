class Solution {
    public int maxDistance(int[] arr) {
        // Code here
        HashMap<Integer,Integer> mp=new HashMap<>(); 
        int res=0;

        for(int i=0;i<arr.length;i++) 
        {
            if(!mp.containsKey(arr[i]))
            mp.put(arr[i],i);
            else
            res=Math.max(res,i-mp.get(arr[i]));
        }
        return res;
    }
}