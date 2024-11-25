class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int minp=Integer.MAX_VALUE,maxp=0;
        for(int i:prices)
        {
            if(i<minp)
            minp=i;
            else if(i-minp>maxp)
            maxp=i-minp;
        }
        return maxp;
    }
}