class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int p=0,m=0,i=0,j=0;
        int n=arr.length;
        while(i<n)
        {
            if(arr[i]<=dep[j])
            {
                p++;
                m=Math.max(m,p);
                i++;
            }
            else
            {
                p--;
                j++;
            }
        }
        return m;
    }
}