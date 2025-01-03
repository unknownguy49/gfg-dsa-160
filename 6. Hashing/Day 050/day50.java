class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        HashMap<Integer,Long> map=new HashMap<>();
        map.put(0,1L);
        
        long c=0;
        int x=0;
        
        for(int num:arr) {
            x^=num;
            c+=map.getOrDefault(x^k,0L);
            map.put(x,map.getOrDefault(x,0L)+1);
        }
        return c;
    }
}