class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        Map<String,ArrayList<String>> map=new HashMap<>();
    
        for (String str:arr) 
        {
            char[] chars=str.toCharArray();
            java.util.Arrays.sort(chars);
            String sortedStr=new String(chars);
            
            map.computeIfAbsent(sortedStr,k->new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}