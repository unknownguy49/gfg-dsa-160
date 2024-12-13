class Solution {
    public int minIncrements(int[] arr) {
        // Code here
        Arrays.sort(arr);
        int operations=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<=arr[i-1])
            {
                operations+=arr[i-1]-arr[i]+1;
                arr[i]=arr[i-1]+1;
            }
        }
        return operations;
    }
}