class Solution {

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        ArrayList<Integer> arr=new ArrayList<>();
        int m=pat.length();
        int n=txt.length();
        if(m>n)
        return arr;
        
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
                arr.add(i-j);
                j=lps[j-1];
            }
            else if(i<n&&txt.charAt(i)!=pat.charAt(j))
            {
                if(j!=0)
                j=lps[j-1];
                else
                i++;
            }
        }
        return arr;
    }
}