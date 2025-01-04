class Solution {
    int countPairs(int[] arr, int k) {
        // code here
        int n=arr.length;  
        HashMap<Integer,Integer> freq=new HashMap<>();
        int c=0;
        for(int i=0;i<n;i++) 
        {
            if(freq.containsKey(arr[i]+k)) 
            c+=freq.get(arr[i]+k); 
          
            if(freq.containsKey(arr[i]-k)) 
            c+=freq.get(arr[i]-k); 
          
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1); 
        }
        return c;
    }
}