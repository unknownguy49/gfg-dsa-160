class Solution {
    static String decodeString(String s) {
        // code here
        char c[]=s.toCharArray();  
        int num[]=new int[s.length()];
        int ni=-1;  
        String str[]=new String[s.length()];  
        int si=-1,i=0,n=0;  
        str[++si]="";  
        while(i<c.length)
        {  
            if(Character.isDigit(c[i]))
            n=n*10+(c[i++]-'0');  
            else if(c[i]=='[')
            {  
                num[++ni]=n;  
                str[++si]="";  
                n=0;  
                i++;  
            }
            else if(c[i]==']')
            {  
                StringBuilder sb=new StringBuilder();  
                for(int j=0;j<num[ni];j++)
                {
                    sb.append(str[si]);  
                }
                str[--si]+=sb.toString();  
                ni--;  
                i++;  
            }
            else  
            str[si]+=c[i++];  
        }  
        return str[0];  
    }
}