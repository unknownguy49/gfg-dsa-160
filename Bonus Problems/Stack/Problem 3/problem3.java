class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>(n);
        for(int i=0;i<n;i++) 
        {
            res.add(-1);
        }
        Stack<Integer> stk=new Stack<>();

        for(int i=2*n-1;i>=0;i--) 
        {
            while(!stk.empty() && stk.peek()<=arr[i%n]) 
            {
                stk.pop();
            }

            if(i<n && !stk.empty())
            res.set(i,stk.peek());
            
            stk.push(arr[i%n]);
        }
        return res;
    }
}