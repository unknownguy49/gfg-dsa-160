class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int low=1;
        int high=stalls[stalls.length-1]-stalls[0];
        while(low<=high)
        {
            int mid=(low+high)/2;
            int cows=1;
            int pos=stalls[0];
            for(int i=1;i<stalls.length;i++)
            {
                if(stalls[i]-pos>=mid)
                {
                    cows++;
                    pos=stalls[i];
                }
            }
            if(cows>=k)
            low=mid+1;
            else
            high=mid-1;
        }
        return high;
    }
}