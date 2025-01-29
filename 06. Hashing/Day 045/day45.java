class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        HashSet<Integer> setA=new HashSet<>();
        for(int num:a) 
        {
            setA.add(num);
        }
        HashMap<Integer,Integer> mapB=new HashMap<>();
        for(int num:b) 
        {
            mapB.put(num,mapB.getOrDefault(num,0)+1);
        }

        for(int num:setA) 
        {
            if(mapB.containsKey(num)) 
            {
                int count=Math.min(mapB.get(num),1);
                for(int i=0;i<count;i++) 
                {
                    res.add(num);
                }
            }
        }
        return res;
    }
}