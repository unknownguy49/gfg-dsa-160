class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        Arrays.sort(nums);
        int n=nums.length;
        int c=1;
        
        List<Integer> result=new ArrayList<>();
        for(int i=1;i<n;i++)
        {
            if(nums[i]==nums[i-1])
            c++;
            else
            {
                if(c>n/3)
                result.add(nums[i-1]);
                c=1;
            }
        }
        if(c>n/3) 
        {
            result.add(nums[n-1]);
        }
        
        return result;
    }
}