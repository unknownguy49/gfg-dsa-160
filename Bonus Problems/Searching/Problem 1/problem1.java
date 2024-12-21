class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target||arr[i]>target)
            return i;
        }
        return arr.length;
    }
}