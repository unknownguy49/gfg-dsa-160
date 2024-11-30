class Solution {
    // k is the maximum number of zeros allowed to flip
    public int maxOnes(int arr[], int k) {
        // code here
        int p=0,c=0,res=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            c++;
            
            while(c>k)
            {
                if(arr[p]==0)
                c--;
                
                p++;
            }
            res=Math.max(res,i-p+1);
        }
        return res;
    }
}