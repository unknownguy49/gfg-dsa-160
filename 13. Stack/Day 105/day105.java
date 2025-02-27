class Solution {
    int s[];  
    int i=-1;
    int min=Integer.MAX_VALUE;
    public Solution() {
        s=new int[100000];
    }

    // Add an element to the top of Stack
    public void push(int x) {
        // code here
        if(i==-1)
        min=x;  
        else 
        min=Math.min(min,x);  
        s[++i]=x;
    }

    // Remove the top element from the Stack
    public void pop() {
        // code here
        if(i!=-1)
        {  
            if(s[i--]==min)
            {  
                min=Integer.MAX_VALUE;  
                for(int j=0;j<=i;j++)
                {
                    min=Math.min(min,s[j]);
                }
            }  
        }  
    }

    // Returns top element of the Stack
    public int peek() {
        // code here
        return i==-1?-1:s[i];
    }

    // Finds minimum element of Stack
    public int getMin() {
        // code here
        return i==-1?-1:min;
    }
}