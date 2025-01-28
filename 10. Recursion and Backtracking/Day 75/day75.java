class Solution {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        ArrayList<String> result=new ArrayList<>();
        if(s==null||s.length()==0)
        return result;
        char chars[]=s.toCharArray();
        Arrays.sort(chars);
        boolean used[]=new boolean[chars.length];
        StringBuilder sb=new StringBuilder();
        backtrack(result,sb,chars,used);
        return result;
    }

    private void backtrack(ArrayList<String> result,StringBuilder sb,char chars[],boolean used[])
    {
        if(sb.length()==chars.length)
        {
            result.add(sb.toString());
            return;
        }
        for(int i=0;i<chars.length;i++)
        {
            if(used[i]||(i>0&&chars[i]==chars[i-1]&&!used[i-1]))
            continue;
            
            used[i]=true;
            sb.append(chars[i]);
            backtrack(result,sb,chars,used);
            used[i]=false;
            sb.deleteCharAt(sb.length()-1);
        }
    }
}