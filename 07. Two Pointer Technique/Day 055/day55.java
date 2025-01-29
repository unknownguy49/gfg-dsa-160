class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int c=0;
        for (int k=2;k<n;k++) 
        {
            int i=0;
            int j=k-1;
            while(i<j) 
            {
                if(arr[i]+arr[j]>arr[k]) 
                {
                    c+=(j-i);
                    j--;
                } 
                else
                i++;
            }
        }
        return c;
    }
}