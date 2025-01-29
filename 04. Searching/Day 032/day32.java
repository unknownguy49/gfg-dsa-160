class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int c[]=new int[a.length+b.length];
        int ct=0;
        for(int i=0;i<a.length;i++)
        {
            c[i]=a[i];
            ct++;
        }
        for(int j=0;j<b.length;j++)
        {
            c[ct]=b[j];
            ct++;
        }
        Arrays.sort(c);
        return c[k-1];
    }
}