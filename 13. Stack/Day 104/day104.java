class Solution {
    public ArrayList<Integer> maxOfMins(int[] arr) {
        // Your code here
        int n=arr.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int res[]=new int[n+1];

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
            int len=right[i]-left[i]-1;
            res[len]=Math.max(res[len],arr[i]);
        }

        for(int i=n-1;i>0;i--)
        {
            res[i]=Math.max(res[i],res[i+1]);
        }
        
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            ans.add(res[i]);
        }
        return ans;
    }
}