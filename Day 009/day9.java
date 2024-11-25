class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int diff=arr[n-1]-arr[0];
        int min,max;
        for(int i=1;i<n;i++)
        {
            min=Math.min(arr[0]+k,arr[i]-k);
            max=Math.max(arr[n-1]-k,arr[i-1]+k);
            
            if(min<0)
            continue;
            diff=Math.min(diff,max-min);
        }
        return diff;
    }
}