class Solution {
    public static int kokoEat(int[] arr, int k) {
        // code here
        int left=1,right=0;
        for(int i=0;i<arr.length;i++)
        {
            right=Math.max(right,arr[i]);
        }
        while(left<right)
        {
            int mid=left+(right-left)/2;
            int hoursRequired=0;
            for(int pile:arr)
            {
                hoursRequired+=(pile+mid-1)/mid;
            }
            if(hoursRequired<=k)
            right=mid;
            else 
            left=mid+1;
        }
        return left;
    }
}