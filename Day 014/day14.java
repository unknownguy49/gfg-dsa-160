class Solution {
    public int myAtoi(String s) {
        // Your code here
        s=s.trim();
        int digit=0;
        char sign='+';
        String n="";
        long num=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            continue;
            
            if(i==0&&(ch=='+'||ch=='-')) 
            { 
                sign=ch;
                continue;
            }
            
            if(ch<='9'&&ch>='0')
            {
                digit++;
                n=n+ch;
            }
            else
            break;
        }
        
        if(digit!=0)
        {
            if(sign=='-')
            num=-(Long.parseLong(n));
            else
            num=Long.parseLong(n);
            
            if(num>Integer.MAX_VALUE) 
            return Integer.MAX_VALUE;
            if(num<Integer.MIN_VALUE) 
            return Integer.MIN_VALUE;
        }
        else
        return 0;
        
        return (int)num;
    }
}