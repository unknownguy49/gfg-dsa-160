class Solution {
    public static String rearrangeString(String s) {
        // code here
        int n=s.length();
        Map<Character,Integer> freq=new HashMap<>();
        for(char c:s.toCharArray())
        {
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        
        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        pq.addAll(freq.entrySet());
        
        StringBuilder res=new StringBuilder();
        
        Map.Entry<Character,Integer> prev=new AbstractMap.SimpleEntry<>('#',-1);
        
        while(!pq.isEmpty()) 
        {
            Map.Entry<Character,Integer> p=pq.poll();
            res.append(p.getKey());
            
            if(prev.getValue()>0)
            pq.offer(prev);
            prev=new AbstractMap.SimpleEntry<>(p.getKey(),p.getValue()-1);
        }
        
        if(res.length()!=n)
        return "";
        
        return res.toString(); 
    }
}