class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        if (arr == null || arr.length == 0) {
            return 0;
        }
        Arrays.sort(arr);
        int longest=1;
        int currentLength=1;
        for(int i=1;i<arr.length;i++) 
        {
            if(arr[i]==arr[i-1]+1) 
            {
                currentLength++;
            } 
            else if(arr[i]!=arr[i-1]) 
            {
                longest=Math.max(longest,currentLength);
                currentLength=1;
            }
        }
        return Math.max(longest,currentLength);
    }
}