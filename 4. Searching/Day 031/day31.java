class Solution {

    public int peakElement(int[] arr) {
        // code here
        int a[]=new int[arr.length+2];
        a[0]=a[a.length-1]=Integer.MIN_VALUE;
        for(int i=1;i<arr.length+1;i++)
        {
            a[i]=arr[i-1];
        }
        for(int i=1;i<arr.length+1;i++)
        {
            if(a[i-1]<a[i]&&a[i+1]<a[i])
            return i-1;
        }
        return -1;
    }
}