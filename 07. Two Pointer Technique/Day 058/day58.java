class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        boolean seen[]=new boolean[26];
        int maxLen=0,left=0;
        for(int right=0;right<s.length();right++) 
        {
            while(seen[s.charAt(right)-'a']) 
            {
                seen[s.charAt(left)-'a']=false;
                left++;
            }
            seen[s.charAt(right)-'a']=true;
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}