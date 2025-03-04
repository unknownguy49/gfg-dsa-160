class Solution {

    public ArrayList<Integer> longestSubarray(int[] arr, int x) {
        // code here
        int n=arr.length,l=0,maxLen=0,start=0;
        ArrayList<Integer> res=new ArrayList<>();
        for(int r=0;r<n;r++)
        {
            while(l<r&&maxDiff(arr,l,r)>x)
            {
                l++;
            }
            if(r-l+1>maxLen)
            {
                maxLen=r-l+1;
                start=l;
            }
        }
        for(int i=start;i<start+maxLen;i++)
        {
            res.add(arr[i]);
        }
        return res;
    }
    
    private int maxDiff(int[]arr,int l,int r)
    {
        int min=arr[l],max=arr[l];
        for(int i=l;i<=r;i++)
        {
            if(arr[i]<min)
            min=arr[i];
            if(arr[i]>max)
            max=arr[i];
        }
        return max-min;
    }
}