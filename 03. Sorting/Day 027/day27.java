class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int ct=0;
        int c[]=new int[a.length+b.length];
        for(int i=0;i<a.length;i++)
        {
            c[i]=a[i];
            ct++;
        }
        for(int i=0;i<b.length;i++)
        {
            c[ct]=b[i];
            ct++;
        }
        Arrays.sort(c);
        
        int p=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=c[i];
            p++;
        }
        for(int i=0;i<b.length;i++)
        {
            b[i]=c[p];
            p++;
        }
    }
}