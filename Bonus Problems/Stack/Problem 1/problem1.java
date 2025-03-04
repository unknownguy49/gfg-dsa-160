class Solution {
    private Stack<Integer> s;
    private int maxEle;
    
    public Solution() {
        s=new Stack<>();
        maxEle=-1;
    }

    // Add an element to the top of Stack
    public void push(int x) {
        // code here
        if(s.isEmpty()) 
        {
            maxEle=x;
            s.push(x);
        }
        else if(x>maxEle) 
        {
            s.push(2*x-maxEle);
            maxEle=x;
        } 
        else
        s.push(x);
    }

    // Remove the top element from the Stack
    public void pop() {
        // code here
        if(s.isEmpty())
        return;

        int top=s.pop();

        if(top>maxEle)
        maxEle=2*maxEle-top;
    }

    // Returns top element of the Stack
    public int peek() {
        // code here
        if(s.isEmpty())
        return -1;

        int top=s.peek();

        return (maxEle<top)?maxEle:top;
    }

    // Finds minimum element of Stack
    public int getMax() {
        // code here
        if(s.isEmpty())
        return -1;
        
        return maxEle;
    }
}