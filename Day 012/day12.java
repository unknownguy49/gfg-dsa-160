class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {
        int maxk=kadane(arr);
        int s=0,mink=Integer.MAX_VALUE,cmin=0;
        // Your code here
        for(int num:arr)
        {
            s+=num;
            cmin=Math.min(cmin+num,num);
            mink=Math.min(mink,cmin);
        }
        if(s==mink)
        return maxk;
        
        return Math.max(maxk,s-mink);
    }
    
    private int kadane(int arr[])
    {
        if(arr==null||arr.length==0)
        return 0;
        int sum=arr[0],max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            sum=Math.max(arr[i],sum+arr[i]);
            max=Math.max(max,sum);
        }
        return max;
    }
}