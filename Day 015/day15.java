class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        int i=s1.length()-1;
        int j=s2.length()-1;
        int c=0;
        String res="";
        
        while(i>=0||j>=0||c!=0)
        {
            int b1=(i>=0)?s1.charAt(i)-'0':0;
            int b2=(j>=0)?s2.charAt(j)-'0':0;
            int s=b1+b2+c;
            c=s/2;
            res=(s%2)+res;
            i--;
            j--;
        }
        
        res=res.replaceAll("^0+","");
        if(res.isEmpty()) 
        {
            res="0";
        }
        return res;
    }
}