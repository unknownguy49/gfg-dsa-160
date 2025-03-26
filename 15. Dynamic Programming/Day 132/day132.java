class Solution {
    class TrieNode {
        TrieNode children[]=new TrieNode[26];
        boolean isWord=false;
    }

    TrieNode root=new TrieNode();
    HashMap<Integer,Boolean> memo=new HashMap<>();
    
    public boolean wordBreak(String s, String[] dictionary) {
        // code here
        for(String word:dictionary) 
        {
            insert(word);
        }
        return search(s,0);
    }
    
    public boolean search(String s,int start) 
    {
        if(start==s.length()) 
        return true;
        
        if(memo.containsKey(start)) 
        return memo.get(start);

        TrieNode node=root;
        for(int end=start;end<s.length();end++) 
        {
            char c=s.charAt(end);
            if(node.children[c-'a']==null) 
            break;
            node=node.children[c-'a'];
            if(node.isWord && search(s,end+1)) 
            {
                memo.put(start,true);
                return true;
            }
        }
        memo.put(start,false);
        return false;
    }
    
    public void insert(String word) 
    {
        TrieNode node=root;
        for(char c:word.toCharArray()) 
        {
            if(node.children[c-'a']==null) 
            node.children[c-'a']=new TrieNode();
            node=node.children[c-'a'];
        }
        node.isWord=true;
    }
}