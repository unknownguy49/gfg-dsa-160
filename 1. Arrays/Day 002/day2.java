class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            continue;
            else
            {
                arr[c]=arr[i];
                c++;
            }
        }
        
        while(c<arr.length)
        {
            arr[c]=0;
            c++;
        }
    }
}