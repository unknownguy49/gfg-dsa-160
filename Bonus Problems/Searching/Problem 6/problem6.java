class Solution {
    public static int minDaysBloom(int m, int k, int[] arr) {
        // code here
        int n=arr.length;
        if(m*k>n)
        return -1;
        int left=1;
        int right=Integer.MAX_VALUE;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(canMakeBouquets(arr,mid,m,k))
            right=mid;
            else 
            left=mid+1;
        }
        return left;
    }
    
    private static boolean canMakeBouquets(int[] arr,int day,int m,int k)
    {
        int bouquets=0,count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=day)
            {
                count++;
                if(count==k)
                {
                    bouquets++;
                    count=0;
                }
            }
            else 
            count=0;
            if(bouquets>=m)
            return true;
        }
        return bouquets>=m;
    }
}