class Solution {
    public int numOfSubset(int[] arr) {
        // Your code goes here
        Set<Integer> s=new HashSet<>();
        for(int num:arr)
        {
            s.add(num);
        }
        
        int c=0;
        for(int x:arr)
        {
            if(!s.contains(x-1))
            {
                int j=x;
                while(s.contains(j))
                {
                    j++;
                }
                c++;
            }
        }
        return c;
    }
}