class Solution {

    public List<Integer> findSplit(int[] arr) {
        // Return an array of possible answer, driver code will judge and return true or
        // false based on
        List<Integer> res=new ArrayList<>();
        int s=0;
        for(int i:arr)
        {
            s+=i;
        }
        if(s%3!=0)
        {
            res.add(-1);
            res.add(-1);
            return res;
        }
        
        int req=s/3;
        int curr=0;
        
        for(int i=0;i<arr.length;i++)
        {
            curr+=arr[i];
            if(curr==req)
            {
                int ssum=0;
                for(int j=i+1;j<arr.length;j++)
                {
                    ssum+=arr[j];
                    if(ssum==req)
                    {
                        res.add(i);
                        res.add(j);
                        return res;
                    }
                }
            }
        }
        res.add(-1);
        res.add(-1);
        return res;
    }
}