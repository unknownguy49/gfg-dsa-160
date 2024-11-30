class Solution {
    public int singleDigit(int n) {
        // code here
        while(n>9)
        {
            n=sum(n);
        }
        return n;
    }
    
    int sum(int n)
    {
        int s=0;
        int r=0;
        while(n!=0)
        {
            r=n%10;
            s+=r;
            n/=10;
        }
        return s;
    }
}