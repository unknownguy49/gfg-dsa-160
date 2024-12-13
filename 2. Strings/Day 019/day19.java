class Solution {
    public static int minChar(String s) {
        // Write your code here
        String rev=new StringBuilder(s).reverse().toString();
        if(s.equals(rev))
        return 0;
        String combined=s+"#"+rev;
        int n=combined.length();
        int lps[]=new int[n];
        int j=0;
        for(int i=1;i<n;i++)
        {
            while(j>0&&combined.charAt(i)!=combined.charAt(j))
            {
                j=lps[j-1];
            }
            if(combined.charAt(i)==combined.charAt(j))
            j++;
            lps[i]=j;
        }
        int longest=lps[n-1];
        return s.length()-longest;
    }
}