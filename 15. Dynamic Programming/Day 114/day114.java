class Solution {
    static String longestPalindrome(String s) {
        // code here
        int n=s.length(),start=0,maxLen=1; 
        for(int i=0;i<n;i++)
        { 
            int l=i,r=i; 
            while(l>=0&&r<n&&s.charAt(l)==s.charAt(r))
            { 
                if(r-l+1>maxLen)
                { 
                    start=l; 
                    maxLen=r-l+1; 
                } 
                l--;
                r++; 
            } 
            
            l=i;r=i+1; 
            while(l>=0&&r<n&&s.charAt(l)==s.charAt(r))
            { 
                if(r-l+1>maxLen)
                { 
                    start=l; 
                    maxLen=r-l+1; 
                } 
                l--;
                r++; 
            } 
        } 
        return s.substring(start,start+maxLen); 
    }
}