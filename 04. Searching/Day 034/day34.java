class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
        if(k>arr.length)
        return -1;
        int low=0,high=0,res=-1;
        for(int pages:arr) 
        {
            low=Math.max(low,pages);
            high+=pages;
        }
        
        while(low<=high) 
        {
            int mid=(low+high)/2,students=1,sum=0;
            for(int pages:arr) 
            {
                if(sum+pages>mid) 
                {
                    students++;
                    sum=0;
                }
                sum+=pages;
            }
            if(students<=k) 
            {
                res=mid;
                high=mid-1;
            } 
            else 
            low=mid+1;
        }
        return res;
    }
}