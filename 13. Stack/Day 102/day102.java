class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
        int n=arr.length;
        int span[]=new int[n];
        int prevGreater[]=new int[n];
        Arrays.fill(prevGreater,-1);
        ArrayList<Integer> res=new ArrayList<>();

        for(int i=1;i<n;i++)
        {
            int j=i-1;
            while(j!=-1&&arr[j]<=arr[i])
            j=prevGreater[j];
            
            prevGreater[i]=j;
        }

        for(int i=0;i<n;i++)
        {
            span[i]=i-prevGreater[i];
        }
        
        for(int i:span)
        {
            res.add(i);
        }
        return res;
    }
}