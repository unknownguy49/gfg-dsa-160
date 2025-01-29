class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        int freq[]=new int[100001];
        int distinctCount=0;
        int start=0;

        for(int end=0;end<arr.length;end++) 
        {
            if(freq[arr[end]]==0)
            distinctCount++;
            
            freq[arr[end]]++;

            if(end-start+1>k) 
            {
                freq[arr[start]]--;
                if(freq[arr[start]]==0)
                distinctCount--;

                start++;
            }

            if(end-start+1==k)
            result.add(distinctCount);
        }

        return result;
    }
}