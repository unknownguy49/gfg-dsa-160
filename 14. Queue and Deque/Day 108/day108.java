class Solution {
    public ArrayList<Integer> maxOfSubarrays(int arr[], int k) {
        // code here
        int n=arr.length;
        ArrayList<Integer> m=new ArrayList<>();
        int max=-1,maxIndex=-1;
        for(int i=0;i<=n-k;i++)
        {
            if(maxIndex<i)
            {
                max=arr[i];maxIndex=i;
                for(int j=i+1;j<i+k;j++)
                {
                    if(arr[j]>max)
                    {
                        max=arr[j];
                        maxIndex=j;
                    }
                }
            }
            else if(arr[i+k-1]>max)
            {
                max=arr[i+k-1];
                maxIndex=i+k-1;
            }
            m.add(max);
        }
        return m;
    }
}