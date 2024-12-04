class Solution {

    public boolean sentencePalindrome(String s) {
        // code here
        StringBuilder f=new StringBuilder();
        s=s.toLowerCase().trim();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch>='a'&&ch<='z')||(ch>='0'&&ch<='9'))
            f.append(ch);
        }
        return f.toString().equals(f.reverse().toString());
    }
}