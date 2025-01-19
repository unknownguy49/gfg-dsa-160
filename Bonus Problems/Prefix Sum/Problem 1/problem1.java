class Solution {
    public int touchedXaxis(int[] arr) {
        // code here
        int curr=0;
        int c=0;
        int ini=arr[0];
        
        for(int i=0;i<arr.length;i++)
        {
            curr+=arr[i];
            if((ini>0&&curr<=0)||(ini<0&&curr>=0))
            c++;
            
            ini=curr;
        }
        return c;
    }
}