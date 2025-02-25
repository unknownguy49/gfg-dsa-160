class Solution {
    public static int getMaxArea(int arr[]) {
        // your code here
        int n=arr.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int maxArea=0;

        left[0]=-1;
        for(int i=1;i<n;i++)
        {
            int j=i-1;
            while(j!=-1&&arr[j]>=arr[i])
            j=left[j];
            
            left[i]=j;
        }

        right[n-1]=n;
        for(int i=n-2;i>=0;i--)
        {
            int j=i+1;
            while(j!=n&&arr[j]>=arr[i])
            j=right[j];
            
            right[i]=j;
        }

        for(int i=0;i<n;i++)
        {
            maxArea=Math.max(maxArea,arr[i]*(right[i]-left[i]-1));
        }

        return maxArea;
    }
}