class Solution {
    public List<String> camelCase(String[] arr, String pat) {
        // code here
        List<String> lst=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            String w=arr[i];
            String w2="";
            for(int j=0;j<w.length();j++)
            {
                char ch=w.charAt(j);
                if(ch>='A'&&ch<='Z')
                w2=w2+ch;
            }
            if(w2.indexOf(pat)==0)
            lst.add(arr[i]);
        }
        return lst;
    }
}