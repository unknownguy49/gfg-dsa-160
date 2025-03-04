class Solution {
    public int sumOfMax(int[] arr) {
        // code here
        int n=arr.length;
        int res=0;
        Stack<Integer> stk=new Stack<>();
        int left[]=new int[n];
        int right[]=new int[n];

        for(int i=0;i<n;++i) 
        {
            while(!stk.isEmpty() && arr[stk.peek()]<arr[i]) 
            {
                stk.pop();
            }
            left[i]=(stk.isEmpty())?(i+1):(i-stk.peek());
            stk.push(i);
        }
        stk.clear();

        for(int i=n-1;i>=0;--i) 
        {
            while(!stk.isEmpty() && arr[stk.peek()]<=arr[i]) 
            {
                stk.pop();
            }
            right[i]=(stk.isEmpty())?(n-i):(stk.peek()-i);
            stk.push(i);
        }

        for(int i=0;i<n;++i) 
        {
            res+=arr[i]*left[i]*right[i];
        }
        return res;
    }
}