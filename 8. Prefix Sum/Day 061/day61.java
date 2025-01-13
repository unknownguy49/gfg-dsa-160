class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int totalSum=0,leftSum=0;
        for(int i=0;i<arr.length;i++)
        {
            totalSum+=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            totalSum-=arr[i];
            if(leftSum==totalSum)
            return i;
            leftSum+=arr[i];
        }
        return -1;
    }
}