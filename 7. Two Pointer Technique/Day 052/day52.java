class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int n=arr.length;
        int i=0,j=n-1;
        int c=0;
        
        while(i<j) 
        {
            if(arr[i]+arr[j]<target) 
            {
                c+=(j-i);
                i++;
            }
            else 
            j--;
        }
        return c;
    }
}