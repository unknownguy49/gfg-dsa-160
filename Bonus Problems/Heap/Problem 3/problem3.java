class Solution {
    public int mostBooked(int n, int[][] meetings) {
        // code here
        int cnt[]=new int[n]; 

        PriorityQueue<int[]> occ=new PriorityQueue<>(new Comparator<int[]>() 
        {
            public int compare(int a[],int b[]) 
            {
                if(a[0]!=b[0]) 
                return Integer.compare(a[0],b[0]); 
    
                return Integer.compare(a[1],b[1]); 
            }
        });

        PriorityQueue<Integer> avail=new PriorityQueue<>();
        for(int i=0;i<n;i++) 
        {
            avail.offer(i);
        }

        Arrays.sort(meetings,new Comparator<int[]>() 
        {
            public int compare(int a[],int b[]) 
            {
                if(a[0]!=b[0])
                return Integer.compare(a[0], b[0]);

                return Integer.compare(a[1], b[1]);
            }
        });

        for (int m[]:meetings) 
        {
            int s=m[0];
            int e=m[1];

            while(!occ.isEmpty() && occ.peek()[0]<=s) 
            {
                avail.offer(occ.poll()[1]);
            }

            if(!avail.isEmpty()) 
            {
                int r=avail.poll();
                occ.offer(new int[]{e,r});
                cnt[r]++;
            } 
            else 
            {
                int earliest[]=occ.poll();
                int t=earliest[0];
                int r=earliest[1];
                occ.offer(new int[]{t+(e-s),r});
                cnt[r]++;
            }
        }

        int maxCnt=0;
        int res=0;
        for(int i=0;i<n;i++) 
        {
            if(cnt[i]>maxCnt) 
            {
                maxCnt=cnt[i];
                res=i;
            }
        }
        return res;
    }
}