class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        // code here
        int n=start.length;
        int room=0;
        int res=0;
        int maxEnd=end[0];
        for(int i=1;i<n;i++)
        {
            maxEnd=Math.max(maxEnd,end[i]);
        }
        
        int meetCnt[]=new int[maxEnd+2];

        for(int i=0;i<n;i++) 
        {
            meetCnt[start[i]]++;
            meetCnt[end[i]]--;
        }
        
        for(int i=0;i<=maxEnd+1;i++) 
        {
            room+=meetCnt[i];
            res=Math.max(res, room);
        }
        return res;
    }
}