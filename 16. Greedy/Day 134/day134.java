class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here.
        int n=start.length,c=0,l=-1;
        int a[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            a[i]=new int[]{finish[i],start[i]};
        }
        Arrays.sort(a,Comparator.comparingInt(x->x[0]));
        for(int[] x:a)
        {
            if(x[1]>l)
            {
                c++;
                l=x[0];
            }
        }
        return c;
    }
}