class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        if(arr==null||arr.length<2)
        return new ArrayList<>();
        
        Arrays.sort(arr);
        
        int left=0;
        int right=arr.length-1;
        int closestSum=Integer.MAX_VALUE;
        
        List<Integer> result=new ArrayList<>();
        
        while(left<right)
        {
            int currentSum=arr[left]+arr[right];
            
            if(Math.abs(currentSum-target)<Math.abs(closestSum-target))
            {
                closestSum=currentSum;
                result=Arrays.asList(arr[left],arr[right]);
            }
            else if(Math.abs(currentSum-target)==Math.abs(closestSum-target))
            {
                if(Math.abs(arr[left]-arr[right])>Math.abs(result.get(0)-result.get(1)))
                result=Arrays.asList(arr[left],arr[right]);
            }
            
            if(currentSum<target)
            left++;
            else 
            right--;
        }
        return result;
    }
}