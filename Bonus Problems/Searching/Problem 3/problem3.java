class Solution {
    public double medianOf2(int a[], int b[]) {
        // Your Code Here
        int ct=0;
        int c[]=new int[a.length+b.length];
        for(int i=0;i<a.length;i++)
        {
            c[ct]=a[i];
            ct++;
        }
        for(int i=0;i<b.length;i++)
        {
            c[ct]=b[i];
            ct++;
        }
        Arrays.sort(c);
        if(c.length%2!=0)
        {
            return c[c.length/2];
        }
        else
        {
            int mid1=c[c.length/2-1];
            int mid2=c[c.length/2];
            return (mid1+mid2)/2.0;
        }
    }
}