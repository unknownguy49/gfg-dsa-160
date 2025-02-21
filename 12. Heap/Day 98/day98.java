class Solution {
    public ArrayList<Double> getMedian(int[] arr) {
        // code here
        ArrayList<Double>r=new ArrayList<>();
        PriorityQueue<Integer>l=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer>h=new PriorityQueue<>();
        
        for(int n:arr)
        {
            if(l.isEmpty()||n<=l.peek())
            l.add(n);
            else 
            h.add(n);
            
            if(l.size()>h.size()+1)
            h.add(l.poll());
            else if(h.size()>l.size())
            l.add(h.poll());
            
            if(l.size()==h.size())
            r.add((l.peek()+h.peek())/2.0);
            else 
            r.add((double)l.peek());
        }
        return r;
    }
}