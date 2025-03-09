class Solution {
    public int countPS(String s) {
        // code here
        int n=s.length();
        int count=0; 
        for(int i=0;i<n;i++)
        { 
            int l=i,r=i; 
            while(l>=0&&r<n&&s.charAt(l)==s.charAt(r))
            { 
                if(r-l+1>=2)
                count++; 
                l--;
                r++; 
            } 
            l=i;
            r=i+1; 
            while(l>=0&&r<n&&s.charAt(l)==s.charAt(r))
            { 
                if(r-l+1>=2)
                count++; 
                l--;
                r++; 
            } 
        } 
        return count; 
    }
}