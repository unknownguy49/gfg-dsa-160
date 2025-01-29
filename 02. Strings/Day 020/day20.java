class Solution {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        if(s1.length()!=s2.length()) 
        return false;
        
        String t=s1+s1;
        return search(s2,t);
    }
    
    static boolean search(String pat,String txt) 
    {
        int m=pat.length();
        int n=txt.length();
        if(m>n)
        return false;
        
        int lps[]=new int[m];
        int j=0;
        for(int i=1;i<m;i++)
        {
            while(j>0&&pat.charAt(i)!=pat.charAt(j))
            j=lps[j-1];
            if(pat.charAt(i)==pat.charAt(j))
            j++;
            lps[i]=j;
        }
        
        int i=0;
        j=0;
        while(i<n)
        {
            if(txt.charAt(i)==pat.charAt(j))
            {
                i++;
                j++;
            }
            if(j==m)
            {
                return true;
            }
            else if(i<n&&txt.charAt(i)!=pat.charAt(j))
            {
                if(j!=0)
                j=lps[j-1];
                else
                i++;
            }
        }
        return false;
    }
}