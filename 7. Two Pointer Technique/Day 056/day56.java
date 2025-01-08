class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int n=arr.length;
        int curr=0;
        int start=0;
        for(int end=0;end<n;end++) 
        {
            curr+=arr[end];
            
            while(curr>target&&start<=end) 
            {
                curr-=arr[start];
                start++;
            }
            
            if(curr==target) 
            {
                ArrayList<Integer> result=new ArrayList<>();
                result.add(start+1);
                result.add(end+1);
                return result;
            }
        }
        ArrayList<Integer> result=new ArrayList<>();
        result.add(-1);
        
        return result;
    }
}