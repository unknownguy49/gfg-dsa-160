class Solution {
    public ArrayList<ArrayList<String>> groupShiftedString(String[] arr) {
        // code here
        ArrayList<ArrayList<String>> res=new ArrayList<>();
        HashMap<String,Integer> mp=new HashMap<>(); 
        for(String s:arr) 
        {
            String hash=getHash(s); 
            if(!mp.containsKey(hash)) 
            {
                mp.put(hash,res.size());
                res.add(new ArrayList<>());
            }
            res.get(mp.get(hash)).add(s); 
        }
        return res;
    }
    
    static String getHash(String s) 
    {
        int shifts=s.charAt(0)-'a'; 
        char chars[]=s.toCharArray();
        for(int i=0;i<chars.length;i++) 
        {
            chars[i]=(char)(chars[i]-shifts); 
            if(chars[i]<'a') 
            chars[i]+=26; 
        }
        return new String(chars);
    }
}