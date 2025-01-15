class Solution {
    public int atMostK(int arr[], int k) {
        // code here
        int n=arr.length;
        int res=0;

        int left=0,right=0;

        Map<Integer,Integer> freq=new HashMap<>();
        while(right<n) 
        {
            freq.put(arr[right],freq.getOrDefault(arr[right],0)+1);

            if(freq.get(arr[right])==1)
            k-=1;
            
            while(k<0) 
            {
                freq.put(arr[left],freq.get(arr[left])-1);
                if(freq.get(arr[left])==0)
                k+=1;
                
                left+=1;
            }
            res+=(right-left+1);
            right+=1;
        }
        return res;
    }
}