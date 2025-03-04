class Solution {
    public int getScore(int arr[], int k) {
        // code here
        int n=arr.length;
        int dp[]=new int[n];
        dp[n-1]=arr[n-1];

        Deque<Integer> dq=new LinkedList<>();
        dq.offer(n-1);  

        for(int i=n-2;i>=0;i--) 
        {
            while(!dq.isEmpty() && dq.peekFirst()>i+k) 
            {
                dq.pollFirst();
            }
            dp[i]=arr[i]+dp[dq.peekFirst()];
            
            while(!dq.isEmpty() && dp[i]>=dp[dq.peekLast()]) 
            {
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        return dp[0];
    }
}