class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max2 && arr[i]<max)
            {
                max2=arr[i];
            }
           
        }
        return max2==Integer.MIN_VALUE?-1:max2;
    }
}