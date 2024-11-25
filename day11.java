class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        if(arr==null||arr.length==0)
        return 0;
        
        int maxpdt=arr[0];
        int minpdt=arr[0];
        int res=arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                int temp=maxpdt;
                maxpdt=minpdt;
                minpdt=temp;
            }
            maxpdt=Math.max(arr[i],maxpdt*arr[i]);
            minpdt=Math.min(arr[i],minpdt*arr[i]);
            res=Math.max(res,maxpdt);
        }
        return res;
    }
}