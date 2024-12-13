class Solution {
    static int minRemoval(int intervals[][]) {
        // code here
        if(intervals.length==0) 
        return 0;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        
        int count=0;
        int lastEnd=intervals[0][1];
        
        for(int i=1;i<intervals.length;i++) 
        {
            int[] current=intervals[i];
            if(current[0]<lastEnd) 
            {
                count++;
                lastEnd=Math.min(lastEnd,current[1]);
            } 
            else 
            lastEnd=current[1];
        }
        return count;
    }
}