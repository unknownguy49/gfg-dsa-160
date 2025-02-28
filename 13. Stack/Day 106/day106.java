class Solution {
    public int evaluate(String[] arr) {
        // code here
        int s[]=new int[arr.length];  
        int i=-1;
        int a,b;  
        for(String x:arr)
        {  
            if(x.equals("+"))
            s[--i]+=s[i+1];  
            else if(x.equals("-"))
            s[--i]-=s[i+1];  
            else if(x.equals("*"))
            s[--i]*=s[i+1];  
            else if(x.equals("/"))
            s[--i]/=s[i+1];  
            else 
            s[++i]=Integer.parseInt(x);  
        }  
        return s[0];  
    }
}