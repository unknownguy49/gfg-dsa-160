class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int n=arr.length;
        int c=0,prev=0;
        for(int i=0;i<n;i++) 
        {
            int curr=arr[i];
            c+=(curr-prev-1);
            if(c>=k) 
            return prev+(k-(c-(curr-prev-1)));
            prev=curr;
        }
        return arr[n-1]+(k-c);
    }
}